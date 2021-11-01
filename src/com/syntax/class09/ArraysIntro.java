package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {
		int num=10; //[] turns the variable into an array that can hold multiple values
		int[] array=new int[4];  //this marks how many elements(values) can be stored in the array
		array[0]=12; //array positions always starts at 0
		array[1]=10;
		array[2]=13;
		array[3]=14;
		System.out.println(array[2]);
		
		//I need to create an array that will hold 3 elements of double type of values
		double[] arr=new double[3];
		arr[0]=11.99;
		arr[1]=1.09;
		arr[2]=3.08;
		//you can reassign values in an array just like any other variable
		arr[1]=100.99;
		System.out.println(arr[1]);
		
		//I want to create an array that will store 4 colors. Strings can also be stored in arrays
		String[] colors=new String[4];
		colors[0]="Red";
		colors[1]="Blue";
		colors[2]="Black";
		colors[3]="Yellow";
		//see how many elements inside array/ what is the size of the array
		System.out.println("Size of the array is "+colors.length);
		//Cannot use a negative number for the size 
		byte[] smallArray=new byte[89997];
		//create an array of chars and store grades into it: A,B,C,D,E,F
		//Then print a grade B
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		
		//2 ways of creating an array
		char[] gradesArray= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(gradesArray.length);
		System.out.println(gradesArray[2]);
		
	}

}
