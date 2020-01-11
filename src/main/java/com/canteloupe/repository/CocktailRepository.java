package com.canteloupe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.canteloupe.model.Cocktail;
import com.canteloupe.model.User;

@Repository("cocktailRepository")
public interface CocktailRepository extends JpaRepository<Cocktail, Integer> {

	public List<Cocktail> findAll();
	//public List<Cocktail> findAllById(int id);
	public List<Cocktail> findAllByUser(User user);
	
	public Cocktail findById(int id);
	public Cocktail findByName(String name);
	//get Cocktail by ingredients
	<C extends Cocktail> C save(Cocktail c);
}
