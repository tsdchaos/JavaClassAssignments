package com.syntax.class6;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double num1;
		double num2;
		char operator;
		double result=0;
		boolean check=true;
		System.out.println("Please enter the first number.");
		num1=input.nextInt();
		System.out.println("Please enter the second number.");
		num2=input.nextInt();
		System.out.println("Do you want to add (+), subtract(-), multiply(*), or divide(/) the two numbers?");
		operator=input.next().charAt(0);
		switch (operator) {
			case ('+'): result=num1+num2;
			break;
			case ('-'): result=num1-num2;
			break;
			case ('*'): result=num1*num2;
			break;
			case ('/'): result=num1/num2;
			break;
			default: check=false;
		}
		if(check) {
			System.out.println("The result of "+num1+" "+operator+" "+num2+" is "+result+".");
		}else {
			System.out.println("Invalid operator entered.");
		}
		

	}

}
