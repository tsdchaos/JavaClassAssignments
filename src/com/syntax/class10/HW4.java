package com.syntax.class10;

public class HW4 {

	public static void main(String[] args) {
		//Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
		String[] categories= {"Veggies", "Fruits", "Dairy", "Sweets"};
		String[][] groceries= {
				{"Celery", "Peppers", "Lettuce"},
				{"Apples", "Peaches", "Oranges", "Bananas"},
				{"Milk", "Cheese"},
				{"Cookies", "Pie", "Candy", "Ice Cream"}
		};
		int category=0;
		for(String[] groceryList:groceries) {
			System.out.print(categories[category]+": ");
			category++;
			for(String g:groceryList) {
				System.out.print(g+"   ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int r=0; r<groceries.length; r++) {
			System.out.print(categories[r]+": ");
			for(int c=0; c<groceries[r].length; c++) {
				String element=groceries[r][c];
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}

}
