package com.syntax.class14;

import java.util.Arrays;

import javax.xml.stream.events.Namespace;

public class Review {

	public static void main(String[] args) {
		String name="    amelia   ";
		System.out.println(name.length()); //calculates how many characters are in the string
		System.out.println(name.startsWith("A")); //boolean that checks if the string starts with that letter
		System.out.println(name.endsWith("M")); //boolean checks if string ends with that character
		System.out.println(name.contains("p")); //boolean checks to see if the string contains specified character
		System.out.println(name.charAt(2)); //tells which character is in the N position in a string (since a String is an array of characters)
		System.out.println(name.indexOf("a", 1)); //tells the position of the specified character in the string. the ", int" tells it to start looking from the specified position
		System.out.println(name.substring(3)); // creates a substring starting from position X
		System.out.println(name.substring(3,5)); // same as above, but stops 1 before the second int
		System.out.println(name.isEmpty()); //boolean that tells if the value is empty or not
		System.out.println(name.trim()); //removes spaces from the start and end of the String
		String sentence = "This is a Java class";
		System.out.println(sentence.split(" ").length);	//places each word in the String into a position of an array
		System.out.println(sentence.split(" ")[0]);
		System.out.println(Arrays.toString(sentence.split(" "))); //Arrays.toString allows you to see what is in the array without a loop
	}

}
