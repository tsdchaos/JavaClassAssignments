package com.syntax.class7;

public class BreakKeyword {

	public static void main(String[] args) {
		for(int i=0; i<=4; i++) {
			System.out.println("It's almost over!");
			break; //break keyword used to exit a block
		}
		while(true) {
			System.out.println("Almost!");
			break;
		}
		System.out.println("-----END OF CODE-----");

	}

}
