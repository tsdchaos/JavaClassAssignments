package com.syntax.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i==3) {
				continue; //skips the rest of the execution of the code inside the loop, and proceeds to the next cycle
			}
			System.out.println("Hello "+i);
		}
		//I want to print numbers from 1 to 10, except number7
		for(int i=1; i<=10; i++) {
			if(i==7||i==3||i==9) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("End of the code");

	}

}
