package com.syntax.class17;

public class DogTester {

	public static void main(String[] args) {
		
		Dog dog=new Dog("Rex", "black", "Husky", 7, 45.7); //if you leave out even 1 var, then you get an error
		//new Dog(); //creates the object, and calls the constructor
		//dog.name="Bobby"; Not allowed, since name is private in the Dog class 
		dog.printName(); //calling the method
		
	}

}
