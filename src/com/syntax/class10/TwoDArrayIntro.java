package com.syntax.class10;

public class TwoDArrayIntro {

	public static void main(String[] args) {

		int[][] bigArray = new int[3][3]; // for 2D arrays, we need to define the size of rows, then columns
		// adding elements inside 1 array or 1 row
		bigArray[0][0] = 10;
		bigArray[0][1] = 20;
		bigArray[0][2] = 30;
		//adding elements inside row 2
		bigArray[1][0]=1;
		bigArray[1][1]=2;
		bigArray[1][2]=3;
		//adding elements inside row 3
		bigArray[2][0] = 100;
		bigArray[2][1] = 200;
		bigArray[2][2] = 300;
		
		//how to access??
		//print 200
		System.out.println(bigArray[2][1]);
		//what it shows?
		System.out.println("2D array size "+bigArray.length); //returns how many 1D arrays it has
	}

}
