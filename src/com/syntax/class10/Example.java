package com.syntax.class10;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// I want to create an array and store elements using scanner
		System.out.println("Please enter how many elements you want to store inside array of cars");
		int size=scan.nextInt();
		String[] cars=new String[size];
		System.out.println("Please enter your cars");
		for(int i=0; i<cars.length; i++) {
			
			cars[i]=scan.next();
		}
		//retrieve all stored elements
		for(String n:cars) {
			System.out.println(n);
		}
	}
}
