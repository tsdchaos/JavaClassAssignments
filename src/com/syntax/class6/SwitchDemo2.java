package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		/*
		 * We need to capture a country from a user
		 * based on the country we have to define a favorite food
		 */
		Scanner input= new Scanner(System.in);
		String country;
		String food=null;
		System.out.println("Please enter a country: ");
		country=input.next();
		switch(country.toLowerCase()) {
			case "italy": food="Pasta";
			break;
			case "japan": food="Sushi";
			break;
			case "china": food="Lo Mein";
			break;
			case "england": food="Fish and Chips";
			break;
			case "united states": food="Sandwich";
			break;
			default: food="Unknown";
			break;
		}
		if(food.equals("Unknown")){
			System.out.println("Try another country");
		}else{
			System.out.println("The food associated with "+country+" is "+food+".");
		}
	}

}
