package com.syntax.class17;

public class Dog {
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	public Dog(String dogname, String dogColor, 
			String dogBreed, int dogAge, double dogWeight) { 
		//this is the constructor. It has the same name as the class
		System.out.println("Dogs constructor is called");
		name=dogname;
		color=dogColor;
		age=dogAge;
		breed=dogBreed;
		weight=dogWeight;
		printAge(); //you can call methods in the constructor, but you can't create them in the constructor
	}
	public void printName() {
		System.out.println(name);
	}
	public void printBreed() {
		System.out.println(breed);
	}
	public void printAge() {
		System.out.println(age);
	}
}
