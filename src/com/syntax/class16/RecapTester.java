package com.syntax.class16;

public class RecapTester {

	public static void main(String[] args) {
		Recap recap=new Recap();
		recap.printNumber(); //number is 0 because the default of number is 0
		recap.setConstantNumber(); //number is now 10 because the setConstantNumber() method was initialized
		recap.printNumber();
		recap.number=9; //assigns 9 to number (since it is an instance variable)
		recap.printNumber();
		recap.setNumber(50); //assigns 50 to num(local variable), then number (instance) is set to num
		recap.printNumber();
		Recap recap2=new Recap();
		recap2.printNumber(); //number is 50 because it is a static number now, and thus shared across objects
		
	}

}
