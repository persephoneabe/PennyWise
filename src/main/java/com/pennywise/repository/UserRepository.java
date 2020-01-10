package com.pennywise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pennywise.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{

	public List<User> findAll();
	public List<User> findAllByUserid(int id);
	
	public User findByUserid(int id);
	public User findByUsername(String name);
	<U extends User> U save(User u);
	
}
