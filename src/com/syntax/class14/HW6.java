package com.syntax.class14;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a String, and I will check if it is a palindrome of not");
		String sentence=input.nextLine();
		String reversed="";
		String sentenceNoSpaces=sentence.replaceAll("[ ]", "");
		char posit;
		for(int i=0; i<sentenceNoSpaces.length(); i++) {
			posit=sentenceNoSpaces.charAt(i);
			reversed=posit+reversed;
		}
		if(sentenceNoSpaces.equalsIgnoreCase(reversed)) {
			System.out.println(sentence+" is a palindrome!");
		}else {
			System.out.println(sentence+" is not a palindrome...");
		}

	}

}
