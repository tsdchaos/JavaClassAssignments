package com.syntax.class14;

public class HW1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		String sentence="This is a test sentence for my Java Homework";
		String newSentence = sentence.replace(" ", "");
		System.out.println(newSentence);

	}

}
