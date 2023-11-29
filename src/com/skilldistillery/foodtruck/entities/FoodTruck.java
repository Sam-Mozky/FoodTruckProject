package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
//doesn't have a main

	private String truckName;
	private String foodType;
	private int foodRating;
	
	public FoodTruck(String truckName, String foodType, int foodRating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.foodRating = foodRating;
	}
	
	public String getTruckName() {
		return truckName;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public double getFoodRating() {
		return foodRating;
	}
	
	
}