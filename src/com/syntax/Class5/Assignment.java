package com.syntax.Class5;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		/*Write a program that will ask user to input inputsthe current time (use 24 hour format)
		 * based on the given time define:
		 * if hour is between 1-11 --> morning
		 * if hour between 12-15 --> afternoon
		 * if hour between 16-20 --> evening
		 * if hour between 21-24 --> Night
		 */
		System.out.println("Please enter the current time: ");
		int hour=input.nextInt();
		String time;
		if(hour>=1 && hour<=11) {
			time="Morning";
		}else if(hour>=12 && hour<=15) {
			time="Afternoon";
		}else if(hour>=16 && hour<=20) {
			time="Evening";
		}else if(hour>=21 && hour <=24) {
			time="Night";
		}else {
			time="Invalid";
		}
		if(time.equals("Invalid")) {
			System.out.println("Invalid time entered.");
		}else {
		System.out.println("right now is "+time);
		}
	}

}
