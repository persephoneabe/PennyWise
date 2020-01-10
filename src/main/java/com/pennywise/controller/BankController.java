package com.pennywise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.Service.BankAccountService;
import com.pennywise.Service.UserService;
import com.pennywise.model.BankAccount;
import com.pennywise.model.User;

@RestController(value = "bankController")
@RequestMapping(value = "/bank")
public class BankController {

	private static BankAccountService bankAccountService;
	private static UserService userService;
	
	@Autowired
	public void setBankAccountService(BankAccountService bankAccountService) {
		BankController.bankAccountService = bankAccountService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		BankController.userService = userService;
	}
	
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BankAccount> getAllBankAccounts(){
		return BankController.bankAccountService.getAllBankAccounts();
		
	}
	
	@GetMapping(value = "/userAll/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BankAccount> getAllBankAccountByUSerId(@PathVariable int id){
		User us = BankController.userService.getUserByID(id);
		return BankController.bankAccountService.getAllBankAccountsByUser(us);
	}
	
	
	
	
}
