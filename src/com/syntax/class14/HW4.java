package com.syntax.class14;

public class HW4 {

	public static void main(String[] args) {
		//How would you reverse a String character by character?
		String sentence="This is a test for Java Class";
		String reversed="";
		char posit;
		for(int i=0; i<sentence.length(); i++) {
			posit=sentence.charAt(i);
			reversed=posit+reversed;
		}
		System.out.println(reversed);
	}

}
