package com.syntax.class15;

public class Task5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		String str="aba";
		StringBuilder strB=new StringBuilder(str);
		strB.reverse();
		if(str.equals(strB)) {
			System.out.println("String is a palindrome");
		}
		
	}

}
