package com.syntax.Class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		// use || to designate "or" for conditions
		System.out.println("Do you have a credit card? ");
		String answer=in.next();
		if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yep") || answer.equalsIgnoreCase("yeah")){
			System.out.println("Please tell me the balance.");
		}else {
			System.out.println("Would you like to get a credit card?");
		}
		System.out.println("End of code.");
		/*
		 * 
		 */
	}

}
