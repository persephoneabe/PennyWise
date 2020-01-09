package com.pennywise.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennywise.model.BankAccount;
import com.pennywise.repository.BankAccountRepository;

@Service(value ="bankAccountService")
public class BankAccountService {

	@Autowired
	BankAccountRepository bankAccountRepository;
	
	public void setBankAccountRepository(BankAccountRepository bankAccountRepository) {
		this.bankAccountRepository = bankAccountRepository;
	}
	
	public void insertBankAccount(BankAccount b) {
		this.bankAccountRepository.save(b);
	}
	
	public List<BankAccount> getAllBankAccounts(){
		return this.bankAccountRepository.findAll();
	}
	
	public List<BankAccount> getAllBankAccountsByID(int id){
		return this.bankAccountRepository.findAllBybankId(id);
	}
	
	public BankAccount getBankAccountByID(int id) {
		return this.bankAccountRepository.findBybankId(id);
	}
	
	public BankAccount getBankAccountByUserName(String name) {
		return this.bankAccountRepository.findBybankUsername(name);
	}
	
}

