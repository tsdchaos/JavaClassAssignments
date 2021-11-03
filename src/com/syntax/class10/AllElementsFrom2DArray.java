package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] groceries = { 
				{ "banana", "apple", "mango" }, 
				{ "potato", "tomato" },
				{ "milk", "cheese", "ayran", "yogurt" } };
		for(String[] grocery:groceries) {
			for(String g:grocery) {
				System.out.println(g);
			}
			System.out.println();
			
		}
		
		int[][] numbers = {
			{100, 200, 450, 500},
			{50, 120, 23, 45}};
			System.out.println(numbers[1][1]);
			System.out.println(" get all elements using enhanced for loop ");
			for(int[] nums:numbers) {
				for(int n:nums) {
					System.out.print(n+" ");
				}
		}
			System.out.println();
			System.out.println(" get all elements using regular for loop ");
			for(int i=0; i<numbers.length; i++) {
				for(int j=0; j<numbers[i].length; j++) {
					int element=numbers[i][j];
					System.out.println(element + " ");
				}
			}
			
	}

}
