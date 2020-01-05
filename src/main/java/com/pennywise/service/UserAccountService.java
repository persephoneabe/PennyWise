package com.pennywise.service;

import java.util.List;

import com.pennywise.model.User;
import com.pennywise.repository.UserAccountRepository;

import org.springframework.stereotype.Service;

@Service(value = "useraccountservice")
public class UserAccountService {

    UserAccountRepository uAR;

    public void insertUserAccount(User x) {
		this.uAR.save(x);
	}
	
	public List<User> getAllUsers(){
		return this.uAR.findAll();
    }
    
    public List<User> getAllByName(String fullname){
        return this.uAR.findAllByName(fullname);
    }
	
	public User getByUsername(String username) {
		return this.uAR.findByUsername(username);
	}
	//This can be a boolean method. Or not at all.
	public User getByUsernameAndPassword(String username, String password) {
		return this.uAR.findByUsernameAndPassword(username, password);
	}
}