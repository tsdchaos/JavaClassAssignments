package com.syntax.class14;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1=input.nextLine();
		System.out.println("Enter the second String");
		String str2=input.nextLine();
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("The first string is now: "+str1);
		System.out.println("And the second string is now: "+str2);
	}

}
