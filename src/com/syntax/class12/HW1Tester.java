package com.syntax.class12;

import java.util.Scanner;

public class HW1Tester {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		HW1Method numbers= new HW1Method();
		System.out.println("Please input one integer");
		numbers.num1=input.nextInt();
		System.out.println("Please input the second integer");
		numbers.num2=input.nextInt();
		numbers.whichIsLarger();
		

	}

}
