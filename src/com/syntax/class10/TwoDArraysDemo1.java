package com.syntax.class10;

public class TwoDArraysDemo1 {

	public static void main(String[] args) {
		// Create an array of groceries

		String[][] groceries = { 
				{ "banana", "apple", "mango" }, 
				{ "potato", "tomato" },
				{ "milk", "cheese", "ayran", "yogurt" } };
		System.out.println(groceries.length); //prints number of arrays
		//print yogurt
		System.out.println(groceries[2][3]);
		//Find out how many elements my 1 array has
		System.out.println("# of elements inside array with index 0= "+groceries[0].length);
		System.out.println("# of elements inside array with index 0= "+groceries[1].length);
		System.out.println("# of elements inside array with index 0= "+groceries[2].length);
		
		//how do we get all elements from 2D array?
		int total=0;
		for(int r=0; r<groceries.length; r++) {
			for(int c=0; c<groceries[r].length; c++) {
				String element=groceries[r][c];
				System.out.print(element);
			if(element.equals("aryan")) {
				System.out.println(r+" "+c);
			}
			total++;
			}
		}
		
	}

}
