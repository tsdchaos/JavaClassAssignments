package com.syntax.class12;

import java.util.Scanner;

public class HW2Tester {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		HW2Method numbers = new HW2Method();
		System.out.println("Please enter one integer");
		numbers.num1=input.nextInt();
		numbers.evenOrOdd();

	}

}
