package com.skilldistillers.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private FoodTruck[] fleet = new FoodTruck[5];
	
		public static void main(String[] args) {
			FoodTruckApp app = new FoodTruckApp();
			app.run();
			
		}
		
		public void run() {
			Scanner userInput = new Scanner(System.in);
			getFoodTruckInput(userInput);
			userInput.close();
		}
		
//userInput 
		
		public void getFoodTruckInput(Scanner userInput) {
			for (int i = 0; i < fleet.length; i++) {
				System.out.println("Please enter the name of the food truck: ");
				String truckName = userInput.nextLine();
				if (truckName.equalsIgnoreCase("quit")) {
					break;
				}
				System.out.println("Please enter the type of food served: ");
				String foodType = userInput.nextLine();
				System.out.println("Please enter desired rating for the food truck: ");
				double foodRating = userInput.nextDouble();
				userInput.close();
				
			}
			
		}
		
		
}
