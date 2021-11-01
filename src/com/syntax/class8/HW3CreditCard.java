package com.syntax.class8;

import java.util.Scanner;

public class HW3CreditCard {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=1;
		while(num1==1){
			System.out.println("Would you like to apply for a credit card? Yes/No");
			String card=input.nextLine();
			if(card.equalsIgnoreCase("yes")) {
				break;
			}
		}
		System.out.println("Ok, let's get you signed up!");
		

	}

}
