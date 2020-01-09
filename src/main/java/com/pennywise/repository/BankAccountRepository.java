package com.pennywise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pennywise.model.BankAccount;

@Repository("bankAccountRepository")
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

	
	public List<BankAccount> findAll();
	public List<BankAccount> findAllBybankId(int id);
	
	BankAccount findBybankId(int id);
	BankAccount findBybankUsername(String name);
	<B extends BankAccount> B save(BankAccount b);
}
