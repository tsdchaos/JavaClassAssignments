package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		String str="asjdkdgfhnJHN4214265ASKDFHAKLFHN298i2304832DSdkjas@($@$!";
		System.out.println(str.replaceAll("[0-5]", "*")); //wherever there is a 0, 1, 2, 3, 4, or 5, a * will be put in its place
		System.out.println(str.replaceAll("[a-z]", "*")); //you can specify a range for characters as well
		System.out.println(str.replaceAll("[A-Z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*").replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*")); //When you use ^ in the brackets, it resembles "NOT", much like !=. Use this to replace all characters
		System.out.println(str.replaceAll("[0-9]", "")); //removes the character from the string
		System.out.println(str.replaceAll("[$%aZ]", "*")); //by not specifying a range, it only removes those specific characters
		/*
		 * This can be used to find patterns in seemingly random strings
		 */

	}

}
