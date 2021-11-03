package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		char[] grades= {'A', 'B', 'C', 'A', 'C'};
		for(char grade:grades) {
			System.out.println(grade);
		}
		for(int i=(grades.length-1); i>=0; i--) {
			System.out.println(grades[i]);
		}
	}

}
