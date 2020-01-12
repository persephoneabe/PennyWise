package com.pennywise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.pennywise.model.Drinks;
import com.pennywise.model.Ingredient;

@RestController(value = "drinkController")
@RequestMapping(value = "/drink")
public class DrinkController {

	
	private static RestTemplate restTemplate;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		DrinkController.restTemplate = restTemplate;
	}
	
	//Search the API by drink Name not case sensitive
	@RequestMapping(value="/search/{name}")
	public Drinks getByName(@PathVariable String name){
		Drinks retrievedDrink = DrinkController.restTemplate.getForObject(
				"https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + name,
				Drinks.class);
		return retrievedDrink;
	}
	
	
//	@RequestMapping(value="/search/{id}")
//	public Drinks getByID(@PathVariable int id){
//		Drinks retrievedDrink = DrinkController.restTemplate.getForObject(
//				"https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=" + id,
//				Drinks.class);
//		return retrievedDrink;
//	}
	
	//Search the API by ID 5 digits for use
	@GetMapping(value = "/search/{id}")
	public Drinks getByID(@PathVariable int id) {
		//String id = "11007";
		String URL = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=" + id;
		Drinks retrievedDrink = (DrinkController.restTemplate.getForObject(URL,
				Drinks.class));
		return retrievedDrink;
	}
	
	
	//Search the API by ingredient Name
	@RequestMapping(value="/ingredient/{name}")
	public Ingredient getByIngredient(@PathVariable String name){
		Ingredient retrieveIngredientd = DrinkController.restTemplate.getForObject(
				"https://www.thecocktaildb.com/api/json/v1/1/search.php?i=" + name,
				Ingredient.class);
		return retrieveIngredientd;
	}
	
	
	
	
	//get a Random drink from API
	@RequestMapping(value="/randomDrink")
	public Drinks getRandomDrink(){
		Drinks retrievedDrink = DrinkController.restTemplate.getForObject(
				"https://www.thecocktaildb.com/api/json/v1/1/random.php",
				Drinks.class);
		return retrievedDrink;
	}
}
