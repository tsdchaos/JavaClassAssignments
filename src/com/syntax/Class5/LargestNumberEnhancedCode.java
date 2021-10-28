package com.syntax.Class5;

import java.util.Scanner;

public class LargestNumberEnhancedCode {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the first number.");
		double num1=input.nextDouble();
		System.out.println("Please enter the second number.");
		double num2=input.nextDouble();
		System.out.println("Please enter the third number.");
		double num3=input.nextDouble();
		
		double largestNumber=0;
		if(num1>num2 && num1>num3) {
			largestNumber=num1;
		}else if(num2>num1 && num2>num3) {
			largestNumber=num2;
		}else {
			largestNumber=num3;
		}
		
		boolean isEven;
		if(largestNumber%2==1) {
			isEven=false;
		}else {
			isEven=true;
		}
		System.out.println(largestNumber+" number is even: "+isEven);
	}

}
