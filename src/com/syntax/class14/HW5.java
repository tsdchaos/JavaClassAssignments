package com.syntax.class14;


public class HW5 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?
		String sentence1="This is a test for Java Class Homework";
		String[] sentence2=sentence1.split("[ ]");
		String sentence3 ="";
		System.out.println("Original Sentence: "+sentence1);
		for(int i=sentence2.length-1; i>=0; i--) {
			sentence3 = sentence3+" "+sentence2[i];
		}
		System.out.println("Reversed sentence: "+sentence3);
		
		
		
	}

}
