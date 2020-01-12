package com.pennywise.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredient {

	@JsonProperty("ingredients")
	private List<IngredientValue> ingredients;

	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
