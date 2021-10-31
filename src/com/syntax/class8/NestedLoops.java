package com.syntax.class8;

public class NestedLoops {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) { //outer loop
			System.out.println("I am an outer loop");
			for(int j=1; j<=4; j++) { //inner loop
				System.out.println("I am an inner loop");
			}
		}
		System.out.println("End of the code");
		
		for(int a=0; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				for(int c=0; c<=9; c++) {
					for(int d=0; d<=9; d++) {
						System.out.println(a+""+b+""+c+""+d);
					}
				}
			}
		}

	}

}
