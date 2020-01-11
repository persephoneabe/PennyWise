package com.canteloupe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NestedIngredients {

	@JsonProperty("idIngredient")
	private int id;
	
	@JsonProperty("strIngredient")
	private String ingredient;

	public NestedIngredients() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return "NestedIngredients [id=" + id + ", ingredient=" + ingredient + "]";
	}
}
