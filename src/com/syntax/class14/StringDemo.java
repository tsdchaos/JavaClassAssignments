package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String str="Today is Tuesday? Today we have java class";
		String[] strArr=str.split("[?]"); //causes the String to split at the question mark
		/* if you want to split at a word, then dont use []
		 * if the character or word appears multiple times, then the String will be split multiple times
		 * replaces the character/word with a comma
		 */
		System.out.println(Arrays.toString(strArr));
	}

}
