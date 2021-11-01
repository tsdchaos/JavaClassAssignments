package com.syntax.class09;

public class AllFromArray {

	public static void main(String[] args) {
		int[] num = { 100, 200, 300, 400, 500 };
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		//to acces all elements from an array we can use "for each" loop/advanced for loop/enhanced
		for(int n:num) { //on the left side of the : we have the variable, and on the right we have the array
			System.out.println(n);
		}
		String[] color= {"red", "blue", "white"};
		for(String col:color) {
			System.out.println(col);
		}

	}

}
