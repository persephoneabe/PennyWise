package com.pennywise.service;

import java.util.List;

import com.pennywise.model.BankAccount;
import com.pennywise.repository.BankAccountRepository;

import org.springframework.stereotype.Service;

@Service(value = "bankaccountservice")
public class BankAccountService {

    BankAccountRepository bAR;

    public void insertBankAccount(BankAccount x) {
		this.bAR.save(x);
	}
	
	public List<BankAccount> getAllBankAccounts(){
		return this.bAR.findAll();
    }
    //This may be redundant. Only considered because User is OneToMany with BankAccount.
    public List<BankAccount> getAllByUsername(String username){
        return this.bAR.findAllByUsername(username);
    }
	
	public BankAccount getByUsername(String username) {
		return this.bAR.findByUsername(username);
    }
    
	public BankAccount getById(int id) {
		return this.bAR.findById(id);
	}
}