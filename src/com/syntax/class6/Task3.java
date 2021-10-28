package com.syntax.class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char grade;
		String explain=null;
		System.out.println("Please enter your letter grade for the class");
		grade=input.next().charAt(0);
		
		switch(grade) {
			case 'A': explain="Excellent";
			break;
			case 'a': explain="Excellent";
			break;
			case 'B': explain="Good";
			break;
			case 'b': explain="Good";
			break;
			case 'C': explain="Satisfactory";
			break;
			case 'c': explain="Satisfactory";
			break;
			case 'D': explain="Bad";
			break;
			case 'd': explain="Bad";
			break;
			default: explain="Not Acceptable";
			break;
		}
		System.out.println("Your grade of "+grade+" is "+explain+"!");
	}

}
