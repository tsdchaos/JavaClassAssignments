package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?
		String sentence1="This is a test for Java Class Homework";
		String[] sentence2=sentence1.split(" ");
		for(String word:sentence2) {
			StringBuilder stringBuilder=new StringBuilder(word); //StringBuilder IS SO MUCH BETTER!!
			System.out.print(stringBuilder.reverse()+" "); // 
		}
	}

}
