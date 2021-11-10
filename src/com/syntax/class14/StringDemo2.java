package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		String str="This is Batch 11 Batch 11 is good";
		System.out.println(str.replace("good", "Great")); //replaces the first word with the second word
		/*
		 * If you want to replace characters, use []
		 */
		str="This is Batch 11 is good Batch 11 is good";
		System.out.println(str.replace("good", "Great").replace("Batch", "Not Batch")); 
		/*
		 * You can chain .replace modifies
		 */
		System.out.println(str.replaceFirst("Great", "Good"));
	}

}
