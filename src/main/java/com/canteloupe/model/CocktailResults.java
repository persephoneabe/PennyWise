package com.canteloupe.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CocktailResults {
	
	@JsonProperty("drinks")
	private List<NestedResults> drinks;
	
	public CocktailResults() {}

	public List<NestedResults> getDrinks() {
		return drinks;
	}

	public void setDrinks(List<NestedResults> drinks) {
		this.drinks = drinks;
	}

	@Override
	public String toString() {
		return "CocktailResults [drinks=" + drinks + "]";
	}
}
