	package com.sytanx.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1=30;
		int number2=20;
		System.out.println("Is number 1 equal to number 2? "+(number1==number2));
		// using == allows you to do a simple true/false test. If the values are equal to eachother, "true" will be printed. If not, then "false" is printed
		System.out.println("Is number 1 different from number 2? "+(number1!=number2));
		// != is to check if two values are NOT equal to each other. 
		boolean results=number1==number2;
		System.out.println("Are numbers 1 and 2 the same?" +results);
		//Using boolean will allow us to assign that True/False result to a variable
		System.out.println("*************************");
		System.out.println("Is number 1 bigger than number 2?  "+(number1>number2));
		// Use > and < to check for "greater than" or "less than"
		// Use >= and <= for "greater/lesser than or equal to"
		System.out.println("Is number 1 greater than or equal to number 2? "+(number1>=number2));
		System.out.println("Is number 1 less than or equal to number 2? "+(number1<=number2));
		
		
	}

}
