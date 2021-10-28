package com.syntax.class4;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the VADMV, also known as the worst place on earth! How old are you?  A: ");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("Here is your new drivers license, I hope you had a pleasant 7 hour wait!");
		} else {
			System.out.print("You are not old enough for a drivers license. ");
			System.out.println("I recommend you apply for your learners permit!");
		}

	}

}
