package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter any sentence: ");
		String sentence=input.nextLine(); //nextLine is used to capture a string with spaces
		System.out.println(sentence);

	}

}
