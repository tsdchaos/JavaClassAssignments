package com.syntax.Class5;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		/* ask user to enter today's day
		 * if monday or friday --> no class
		 * tuesday or wednesday --> manual class
		 * saturday or sunday --> java class
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter today's day:");
		String day=input.next();
		if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")){
			System.out.println("No class today.");
		}else if(day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")) {
			System.out.println("We have manual class today.");
		}else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
			System.out.println("We have Java class today");
		}else if(day.equalsIgnoreCase("Thursday")) {
			System.out.println("We have review class today");
		}else {
			System.out.println("Wrong input.");
		}

	}

}
