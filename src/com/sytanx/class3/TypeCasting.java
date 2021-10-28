package com.sytanx.class3;

public class TypeCasting {

	public static void main(String[] args) {
		double number=10.8; //define
		int number2; //define
		number2=(int)number; //assigning
		/* (use (int) to tell java to convert the type from double to int. 
		*  Even if the double has decimal points, it will convert to the nearest integer (rounded down)
		*/
		System.out.println(number2);
		int number3=10;
		double number4=number3; //moving from "small box to big box" is still type casting, but it is implicit. It happens automatically.
		int number5=1256;
		byte number6=(byte)number5;
		System.out.println(number6);
		
		
		

	}

}
