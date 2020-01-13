package com.pennywise.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennywise.model.User;
import com.pennywise.repository.UserRepository;


@Service(value = "userService")
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	
	public void insertUser(User u) {
		this.userRepository.save(u);
	}
	
	public List<User> getAllUsers(){
		return this.userRepository.findAll();
	}
	
	public List<User> getAllUsersByID(int id){
		return this.userRepository.findAllByUserid(id);
	}
	
	public User getUserByID(int id) {
		return this.userRepository.findByUserid(id);
	}
	
	public User getUserByUsername(String name) {
		return this.userRepository.findUserByUsername(name);
	}
	
}
