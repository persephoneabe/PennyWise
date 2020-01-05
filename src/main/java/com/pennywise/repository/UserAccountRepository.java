package com.pennywise.repository;

import java.util.List;

import com.pennywise.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("useraccountrepository")
public interface UserAccountRepository extends JpaRepository<User, String>{

    List<User> findAll();
    List<User> findAllByUsername(String username);
    List<User> findAllByName(String fullname);
    User findByUsername(String username);
	User findByUsernameAndPassword(String username, String password); //Placed here temporarily to think about.
	User findById(int id); //This may not be necessary.
	<X extends User> X save(User x); //Account creation method.
}