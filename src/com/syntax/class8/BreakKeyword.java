package com.syntax.class8;

public class BreakKeyword {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.println("Almost done");
			break;
		}
		for(int i=0; i<=10; i++) {
			System.out.println("Almost done");
			if(i==3) {
				System.out.println("About to break the loop");
				break;
			}
		}
		boolean summer=true;
		int temp=75;
		while(summer) {
			System.out.println("I am happy, I love summer");
			temp+=5;
			if(temp>95) {
				break;
			}
		}

	}

}
