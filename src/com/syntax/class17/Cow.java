package com.syntax.class17;

public class Cow {
	static int price=5;
	String name;
	String breed;
	String color;
	double weight;
	int age;
	public Cow(String name, String breed, String color, double weight, int age) {
		 //"this" keyword is used to distinguish between local and instance variables
		this(name, breed, color, age); 
		this.weight = weight;

	}
	//right click, select source, then generate Constructor using fields creates the above
	public Cow(String name, String breed, String color, int age) {	
		this(name, breed, color);
		this.age = age;
	}
	public Cow(String name, String breed, String color) {	
		this(name, breed);
		this.color = color;
	}
	public Cow(String name, String breed) {	
		this(name);
		this.breed = breed;

	}
	public Cow(String name) {	
		this.name = name;
		
	}
	public Cow() {
		printAllInfo();
	}
	void printName() {
		System.out.println(name);
	}
	void printAllInfo() {
		System.out.println("name "+name+"\nbreed "+breed+"\nage "+age+"\ncolor "+color+"\nweight "+weight);
	}
	public static void main(String[] args) {
		Cow cow=new Cow();
		cow.printAllInfo();
	}
}
