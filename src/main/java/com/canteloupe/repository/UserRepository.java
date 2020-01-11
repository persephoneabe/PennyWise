package com.canteloupe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.canteloupe.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findAll();
	//public List<User> findAllById(int id);
	
	public User findById(int id);
	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username, String password);
	<U extends User> U save(User u);
}
