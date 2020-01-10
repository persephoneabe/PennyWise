package com.pennywise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pennywise.model.BankAccount;
import com.pennywise.model.User;

@Repository("bankAccountRepository")
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

	
	public List<BankAccount> findAll();
	public List<BankAccount> findAllByBankid(int id);
	public List<BankAccount> findAllByUser(User user);
	
	
	public BankAccount findByBankid(int id);
	public BankAccount findByBankusername(String name);
	<B extends BankAccount> B save(BankAccount b);
}
