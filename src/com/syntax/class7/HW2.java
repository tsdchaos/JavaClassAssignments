package com.syntax.class7;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Hello! What are you purchasing today?");
		String item=input.next();
		System.out.println("How much does "+item+" cost?");
		double cost=input.nextDouble();
		System.out.println("Ok! Please pay $"+cost+" for "+item+".");
		double paid=0;
		double change;
		double pay;
		do{
			System.out.println("Pay: ");
			pay=input.nextDouble();
			paid+=pay;
			if(paid>cost) {
				change=paid-cost;
				paid-=change;
				System.out.println("Here is $"+change+" in change!");
			}else if(paid<cost) {
				change=cost-paid;
				System.out.println("You still owe $"+change);
			}
		}while(paid!=cost);
		System.out.println("Thank you for shopping!");
		
	}

}

