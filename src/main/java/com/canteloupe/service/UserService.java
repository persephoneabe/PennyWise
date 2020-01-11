package com.canteloupe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canteloupe.model.User;
import com.canteloupe.repository.UserRepository;

@Service(value = "userService")
public class UserService {

	@Autowired
	UserRepository ur;
	
	public void insertUser(User u) {
		this.ur.save(u);
	}
	
	public List<User> getAllUsers(){
		return this.ur.findAll();
	}
	
//	public List<User> getAllUsersById(int id){
//		return this.ur.findAllById(id);
//	}
	
	public User getUserById(int id) {
		return this.ur.findById(id);
	}
	
	public User getUserByUsername(String username) {
		return this.ur.findByUsername(username);
	}

	public User login(String username, String password) {
		return this.ur.findByUsernameAndPassword(username, password);
	}
}
