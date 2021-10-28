package com.syntax.Class5;

import java.util.Scanner;

public class LogicalAndDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ask a user to enter a number 
		 * based on the entered #, we will define if number is small, medium, or large
		 * if number is between 1 and 10 --> small
		 * if number is between 11 and 100 --> medium
		 * if number is between 101 and 1000 --> large
		 * if number is more than 1001 --> xLarge
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num1=input.nextInt();
		if(num1>1 && num1<=10) {
			System.out.println(num1+" is small.");
		}else if(num1>10 && num1<=100) {
			System.out.println(num1+ "is medium.");
		}else if(num1>11 && num1<=1000) {
			System.out.println(num1+" is large.");
		}else if(num1>1000){
			System.out.println(num1+" is extra-large.");
		}else if(num1==0) {
			System.out.println("You entered "+num1);
		}else if(num1<0) {
			System.out.println(num1+" is a negative number.");		
		}
	}

}
