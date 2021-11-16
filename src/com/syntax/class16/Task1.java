package com.syntax.class16;

public class Task1 {
	//Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
	//Method should be visibly only within same package and accessible by the creating an instance of the class. 
	int arrayTest(int[] arr) {
		int total=0;
		for(int number:arr) {
			total+=number;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		Task1 arrTest=new Task1();
		System.out.println(arrTest.arrayTest(arr));
		
	}
}
