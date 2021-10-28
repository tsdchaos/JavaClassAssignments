package com.syntax.class4;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter an item you want to buy: ");
		String item=input.next();//captures string until a space (basically captures one word)
		System.out.print("Please enter the price of "+item+": ");
		double price=input.nextDouble(); //(captures 1 double value)
		System.out.println("You selected "+item+" with price = $"+price);
		
	}

}
