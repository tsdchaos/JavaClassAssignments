package com.syntax.class14;

public class HW2 {

	public static void main(String[] args) {
		//Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
		String rand="fjdsklfhASFJfjAFDH@473281dsf23481209dasKJLFHA!*#(@$";
		String rand2=rand.replaceAll("[^a-zA-Z]", "");
		int num=rand.length();
		System.out.println("Length of the string "+num);
		int num1=rand2.length();
		System.out.println("Number of alpha characters only "+num1);
	}

}
