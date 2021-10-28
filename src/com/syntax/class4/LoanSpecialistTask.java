package com.syntax.class4;

import java.util.Scanner;

public class LoanSpecialistTask {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("How much money do you need to borrow?   A: ");
		int loan=input.nextInt();
		if(loan<=200000) {
			System.out.println("Congratulations! You are approved for your loan!");
		}else {
			System.out.println("Sorry, but we are not able to approve your loan at this time.");
		}
	}

}
