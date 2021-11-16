package com.syntax.class17;

public class Car {
	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engineCC;
	private String VIN;
	private int mileage;
	private int maxSpeed;
	private boolean sunroof;

	public Car(String carName, String carMake, String carModel, 
			String carColor, int carYear, int carEngine, int carMileage, 
			int carSpeed, boolean carSun, String carVIN) {
		name=carName;
		make=carMake;
		model=carModel;
		color=carColor;
		year=carYear;
		engineCC=carEngine;
		mileage=carMileage;
		sunroof=carSun;
		maxSpeed=carSpeed;
		VIN=carVIN;
		
	}
	public Car(String carName, String carMake, String carModel, 
			String carColor, int carYear, int carEngine, int carMileage) {
		name=carName;
		make=carMake;
		model=carModel;
		color=carColor;
		year=carYear;
		engineCC=carEngine;
		mileage=carMileage;
	}
	public Car(String carName) { //only one parameter for ease for end user
		//having multiple constructors can allow a better user experience
		name=carName;
	}
	public Car() { //no parameter constructor for ease of use
		//this is needed as the default constructor is now gone
	}
	public void printName() {
		System.out.println(name);
	}
	public void sayHello() {
		
	}
}
