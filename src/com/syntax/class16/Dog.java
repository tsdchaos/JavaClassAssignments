package com.syntax.class16;

public class Dog {
	
	String name;
	static int noOfLegs=4;
	
	void displayName() {
		System.out.println(name);
		DisplayLegs(); //can call static methods/variables inside instance methods
	}
	static void DisplayLegs() {
		System.out.println();
		System.out.println(noOfLegs);
		//displayName(); //cant call instance variables or methods inside a static method
	}
}
