package com.syntax.class4;

import java.util.Scanner;

//shortcut to import existing class to the current class
//windows ctr+shift+o
public class ScannerPractice {

	public static void main(String[] args) {
		/*scanner is used to capture input from the user and input it into the program
		*Never name a class "Scanner" "ScannerDemo or ScannerPractice" are both fine
		*scanner is a defined class already
		*/ 
		String str="abc";
		str="zyx";
		Scanner scan=new Scanner(System.in);//This line creates a new variable that gets a value assigned to it by the user
		System.out.print("Please enter your first name: ");
		String firstName=scan.next(); //it will capture String value from console
		System.out.print("Please enter your last name: ");
		String lastName=scan.next();
		System.out.print("Please enter your age: ");
		int age=scan.nextInt(); //to capture integer values
		System.out.println("Hello "+firstName+" "+lastName);
		System.out.println("You are "+(age)+" years old.");
		
	}

}
