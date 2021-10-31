package com.syntax.Class5;

import java.util.Scanner;

public class Class5HW1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the month you were born:");
		String month=input.next();
		String season=null;
		if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
			season="Winter";
		}else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
			season="Spring";
		}else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
			season="Autumn";
		}
		if(season != null) {
			System.out.println("You were born in "+season+".");
		}else {
			System.out.println("Wrong input, please try again.");
		}

	}

}
