package com.syntax.class11;

public class Car {
	String make;
	String model;
	String color;
	int year;
	int milage;

	void moveForward() { // this is a behavior, which is written outside main method, that can be called
							// on to run in main method
		System.out.println("Car can move forward");
	}

	void applyBreaks() {
		System.out.println("Applying brakes!");
	}

	public static void main(String[] args) {
		Car alansCar = new Car();
		alansCar.make = "Tesla";
		alansCar.model = "S";
		alansCar.color = "Black";
		System.out.println("Alans car is a " + alansCar.make);
		System.out.println("Alans car model is a " + alansCar.model);
		System.out.println("Alans cars color is " + alansCar.color);
		alansCar.moveForward();
	}
}
