package com.syntax.class7;

import java.util.Scanner;

public class Task1 {
// Ask name and age 5 times
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=1;
		while(num1<=5) {
		System.out.println("Please enter your name and age.");
		String name=scan.next();
		int age=scan.nextInt();
		System.out.println("Your name is "+name+" and you are "+age+" years old.");
		num1++;
		}
	}

}
