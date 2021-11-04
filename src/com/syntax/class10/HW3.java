package com.syntax.class10;

public class HW3 {

	public static void main(String[] args) {
		//Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
		String[][] cars= {
				{"American", "German", "Korean", "Italian"},
				{"Ford", "BMW", "Hyundai", "Ferrari"}
		};
		System.out.println("Retrieving cars using enhanced for loop");
		for(String[] car:cars) {
			for(String c:car) {
				System.out.print(c+"   ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Retrieving cars using regular for loop");
		for(int r=0; r<cars.length; r++) {
			for(int c=0; c<cars[r].length; c++) {
				String element=cars[r][c];
				System.out.print(element+"  ");
			}
			System.out.println();
		}

	}

}
