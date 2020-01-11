package com.pennywise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.pennywise.model.Drinks;

@RestController(value = "drinkController")
@RequestMapping(value = "/drink")
public class DrinkController {

	
	private static RestTemplate restTemplate;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		DrinkController.restTemplate = restTemplate;
	}
	

	@RequestMapping(value="/sort/{name}")
	public Drinks getByName(@PathVariable String name){
		Drinks retrievedDrink = DrinkController.restTemplate.getForObject(
				"https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + name,
				Drinks.class);
		return retrievedDrink;
	}
	
	@RequestMapping(value="/ingredient/{name}")
	public Drinks getByIngredient(@PathVariable String name){
		Drinks retrievedDrink = DrinkController.restTemplate.getForObject(
				"https://www.thecocktaildb.com/api/json/v1/1/filter.php?i=" + name,
				Drinks.class);
		return retrievedDrink;
	}
	
	
	
	@RequestMapping(value="/randomDrink")
	public Drinks getRandomDrink(){
		Drinks retrievedDrink = DrinkController.restTemplate.getForObject(
				"https://www.thecocktaildb.com/api/json/v1/1/random.php",
				Drinks.class);
		return retrievedDrink;
	}
}
