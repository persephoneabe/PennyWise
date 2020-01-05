package com.pennywise.repository;

import java.util.List;

import com.pennywise.model.BankAccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bankaccountrepository")
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

    List<BankAccount> findAll();
    List<BankAccount> findAllById(int id);
    List<BankAccount> findAllByUsername(String username);
    BankAccount findById(int id);
    BankAccount findByUsername(String username);
}