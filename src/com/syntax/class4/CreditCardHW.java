package com.syntax.class4;

import java.util.Scanner;

public class CreditCardHW {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card? Y/N");
		char card=input.next().charAt(0);
		if (card=='Y'||card=='y') { //use || to add another condition to the if statement
			System.out.println("What is your current balance on the card?  A: ");
			int balance=input.nextInt();
			if(balance>1000) {
				System.out.println("You need to immediately pay off your balance.");
			}else {
				System.out.println("You are still able to spend more.");
			}
		}else {
			System.out.println("Would you like to apply for a card today?");
		}
	}

}
