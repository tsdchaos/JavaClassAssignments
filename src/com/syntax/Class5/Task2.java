package com.syntax.Class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int day=input.nextInt();
		if(day>=1 && day<=5) {
			System.out.println("It is a weekday!");
		}else if(day==6 || day ==7) {
			System.out.println("It is the weekend!");
		}else {
			System.out.println("Invalid day.");
		}

	}

}
