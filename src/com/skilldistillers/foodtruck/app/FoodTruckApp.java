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
			displayMenu(userInput);
			userInput.close();
		}
		
//userInput 
//Story #1

		public void getFoodTruckInput(Scanner userInput) {
			
			System.out.println("Welcome to 'Rate My Food Truck'");
			for (int i = 0; i < fleet.length; i++) {
				System.out.println("Please enter the name of the food truck: ");
				String truckName = userInput.nextLine();
//Story#2
				if (truckName.equalsIgnoreCase("quit")) {
					break;
				}
				System.out.println("Please enter the type of food served: ");
				String foodType = userInput.nextLine();
				System.out.println("Please enter desired rating for the food truck: ");
				double foodRating = userInput.nextDouble();
				userInput.nextLine();
			}
		}
		
//PastaParty, SushiKing, SandwichLady, Taco-boutIt, Pieca-Pizza
			
//Story#3
		public void displayMenu(Scanner userKeyboard) {
			
			int userChoice = 0;
			
			while(userChoice != 4) {
				System.out.println("Hello! Please enter a number that corresponds with your desired choice");
				System.out.println("1. List all food trucks");
				System.out.println("2. Display average food truck ratings");
				System.out.println("3. Display top rated food truck");
				System.out.println("4. Quit");
				userChoice = userKeyboard.nextInt();
				
			}
			
			switch (userChoice) {
			
			case 1:
				displayFoodtrucks();
				break;
			case 2:
				System.out.println("The average rating for all food trucks is: " + calcFleetRatingAverage());
				break;
			case 3:
				System.out.println("The top rated food truck is: " + topRatedFoodTruck());
				break;
			case 4:
				System.out.println("Goodbye");
			}
			
		}
		
		public void displayFoodtrucks() {
			for (FoodTruck truck : fleet) {
				if (truck != null) {
					System.out.println(truck);
				}
			}
		}
		
		public double calcFleetRatingAverage() {
			double totalRatingSum = 0;
			double numFleet = 0;
			double average = totalRatingSum % numFleet;
			return average;
		}
		
		public FoodTruck topRatedFoodTruck() {
			FoodTruck topRatedFoodTruck = fleet[0];
			
			return topRatedFoodTruck;
		}
			
}
		

