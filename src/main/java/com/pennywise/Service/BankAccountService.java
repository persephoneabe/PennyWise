package com.pennywise.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennywise.model.BankAccount;
import com.pennywise.model.User;
import com.pennywise.repository.BankAccountRepository;

@Service(value ="bankAccountService")
public class BankAccountService {

	@Autowired
	BankAccountRepository bankAccountRepository;
	
	
	
	public void insertBankAccount(BankAccount b) {
		this.bankAccountRepository.save(b);
	}
	
	public List<BankAccount> getAllBankAccounts(){
		return this.bankAccountRepository.findAll();
	}
	
	public List<BankAccount> getAllBankAccountsByID(int id){
		return this.bankAccountRepository.findAllByBankid(id);
	}
	
	public List<BankAccount> getAllBankAccountsByUser(User user){
		return this.bankAccountRepository.findAllByUser(user);
	}
	
	public BankAccount getBankAccountByID(int id) {
		return this.bankAccountRepository.findByBankid(id);
	}
	
	public BankAccount getBankAccountByUserName(String name) {
		return this.bankAccountRepository.findByBankusername(name);
	}
	
}

