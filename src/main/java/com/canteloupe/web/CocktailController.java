package com.canteloupe.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.canteloupe.model.Cocktail;
import com.canteloupe.model.CocktailResults;
import com.canteloupe.model.IngredientResults;
import com.canteloupe.model.NestedResults;
import com.canteloupe.model.User;
import com.canteloupe.service.CocktailService;
import com.canteloupe.service.UserService;

@RestController(value = "cocktailController")
@RequestMapping(value = "/cocktail")
public class CocktailController {

	private static CocktailService cocktailService;
	private static UserService userService;
	
	@Autowired
	public void setCocktailService(CocktailService cocktailService) {
		CocktailController.cocktailService = cocktailService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		CocktailController.userService = userService;
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String index() {
		return "main";
	}
	
	@GetMapping(value = "/allCocktails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cocktail> getAllCocktails() {
		return CocktailController.cocktailService.getAllCocktails();
	}
	
	@GetMapping(value = "/userAll/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cocktail> getAllCocktailsByUserId(@PathVariable int id){
		User us = CocktailController.userService.getUserById(id);
		return CocktailController.cocktailService.getAllCocktailsByUser(us);
	}
	
	@GetMapping(value = "/allCocktails/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cocktail getCocktailById(@PathVariable int id) {
		return CocktailController.cocktailService.getCocktailById(id);
	}
	
	@GetMapping(value = "/allCocktails/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cocktail getCocktailByName(@PathVariable String name) {
		return CocktailController.cocktailService.getCocktailByName(name);
	}
	
	//API TRIALS --- use to finalize the above methods
//	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	//should be fine
	@GetMapping(value = "/random")
	public CocktailResults getRandomCocktail() {
		String URL ="https://www.thecocktaildb.com/api/json/v1/1/random.php";
		CocktailResults selfDestruct = this.restTemplate.getForObject(URL, CocktailResults.class);
		return selfDestruct;
	}
	
	//should be fine, 5 integer ID.
	@GetMapping(value = "/{id}")
	public NestedResults getCocktailId(@PathVariable int id) {
//		String id = "11007";
		String URL = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=" + id;
		NestedResults selfDestruct = (this.restTemplate.getForObject(URL,
				NestedResults.class));
		return selfDestruct;
	}
	//works, though returns array of objects. Some can have null values.
	@GetMapping(value = "/{name}")
	public List<NestedResults> getCocktailNames(@PathVariable String name) {
//		String name = "vodka";
		String URL = "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=" + name;
		CocktailResults selfDestruct = (this.restTemplate.getForObject(URL,
				CocktailResults.class));
		return new ArrayList<>(selfDestruct.getDrinks());
	}
	//should be fine
	@GetMapping(value = "/{ingredients}")
	public IngredientResults getCocktailIngredients(@PathVariable String ingredients) {
//		String ingredients = "vodka";
		String URL = "https://www.thecocktaildb.com/api/json/v1/1/search.php?i=" + ingredients;
		IngredientResults selfDestruct = this.restTemplate.getForObject(URL,
				IngredientResults.class);
		return selfDestruct;
	}
	
//	@GetMapping(value = "/random")
//	public Cocktail getRandomCocktail() {
//		String URL ="https://www.thecocktaildb.com/api/json/v1/1/random.php";
//		RestTemplate restTemplate = new RestTemplate();
//		Cocktail cocktail = new Cocktail();
//		cocktail = restTemplate.getForObject(URL, Cocktail.class);
//		return cocktail;
//	}
}
