package com.canteloupe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canteloupe.model.Cocktail;
import com.canteloupe.model.User;
import com.canteloupe.repository.CocktailRepository;

@Service(value = "cocktailService")
public class CocktailService {

	@Autowired
	CocktailRepository cr;
	
	public void insertCocktail(Cocktail c) {
		this.cr.save(c);
	}
	
	public List<Cocktail> getAllCocktails(){
		return this.cr.findAll();
	}
	
//	public List<Cocktail> getAllCocktailsById(int id){
//		return this.cr.findAllById(id);
//	}
	
	public List<Cocktail> getAllCocktailsByUser(User user){
		return this.cr.findAllByUser(user);
	}
	
	public Cocktail getCocktailById(int id) {
		return this.cr.findById(id);
	}
	
	public Cocktail getCocktailByName(String name) {
		return this.cr.findByName(name);
	}
}
