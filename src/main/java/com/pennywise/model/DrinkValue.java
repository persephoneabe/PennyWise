package com.pennywise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DrinkValue {
	
	@JsonProperty("idDrink")
	String idDrink;
	
	@JsonProperty("strDrink")
	String strDrink;
	
	@JsonProperty("strTags")
	String strTags;
	
	@JsonProperty("strCategory")
	String strCategory;
	
	@JsonProperty("strIBA")
	String strIBA;
	
	@JsonProperty("strAlcoholic")
	String strAlcoholic;
	
	@JsonProperty("strGlass")
	String strGlass;
	
	@JsonProperty("strInstructions")
	String strInstructions;
	
	@JsonProperty("strDrinkThumb")
	String strDrinkThumb;
	
	@JsonProperty("strIngredient1")
	String strIngredient1;
	@JsonProperty("strIngredient2")
	String strIngredient2;
	@JsonProperty("strIngredient3")
	String strIngredient3;
	@JsonProperty("strIngredient4")
	String strIngredient4;
	@JsonProperty("strIngredient5")
	String strIngredient5;
	
	
	@JsonProperty("strMeasure1")
	String strMeasure1;
	@JsonProperty("strMeasure2")
	String strMeasure2;
	@JsonProperty("strMeasure3")
	String strMeasure3;
	@JsonProperty("strMeasure4")
	String strMeasure4;
	@JsonProperty("strMeasure5")
	String strMeasure5;
	
	
	
	

	public DrinkValue() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
