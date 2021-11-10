package com.syntax.class12;

import java.util.Scanner;

public class HW3Tester {

	public static void main(String[] args) {
		HW3Method countries=new HW3Method();
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the name of a country.");
		countries.country=input.next();
		countries.printHello();

	}

}
