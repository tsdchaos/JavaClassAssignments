package com.syntax.class15;

public class Dog {

	String name; //instance variable
	String color; //instance variable
	//variables declared outside a method but inside a class are called instance variables
	//Instance variables take up memory inside the computer perpetually
	static int noOfLegs=4; //static variable. Similar to an instance variable, but has the static modifier
	//static modifiers cannot be declared inside a method
	//static variables remain constant across methods. When changed, they change for all methods
	//if I know that the variable will generally stay the same for all methods, use Static instead of Instance
	void sleep() {
		int time=0; //Local variable
		//Variables declared inside a method are called Local Variables. They cannot be accessed outside the method or block of code
		//local variables are only stored as long as the block of code is running
		System.out.println(name+" is sleeping");
	}
	void eat() {
		//System.out.println(time); time is a local variable, so it cannot be accessed outside the sleep method
		System.out.println(name+" can eat");
		//the name variable is an instance variable. So it can be accessed by anything in the same class
	}


}
