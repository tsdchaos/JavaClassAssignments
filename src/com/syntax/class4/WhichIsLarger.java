package com.syntax.class4;

import java.util.Scanner;

public class WhichIsLarger {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int num1=user.nextInt();
		System.out.print("Please input your second number: ");
		int num2=user.nextInt();
		if (num1>num2) {
			System.out.println("Your first number, "+num1+" is larger than your second number, "+num2+".");
		}else if (num1==num2) {
			System.out.println("Both of your numbers are the same!");
		}else {
			System.out.println("Your first number, "+num1+" is smaller than your second number, "+num2+".");
		}
	}

}
