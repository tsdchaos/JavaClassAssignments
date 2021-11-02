package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		int IntArray[]= {5, 2, 78, 3, 45, 56, 101, 25};
		int total=0;
		for(int i=0; i<IntArray.length; i++) {
			total+=IntArray[i];
		}
		System.out.print("The sum of all the integers in the array is: ");
		System.out.println(total);

	}

}
