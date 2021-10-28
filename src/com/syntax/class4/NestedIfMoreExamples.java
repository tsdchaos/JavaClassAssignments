package com.syntax.class4;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		boolean replCompleted=true;
		int assignments=5;
		if(replCompleted) {
			System.out.println("Great job!");
			if(assignments>5) {
				System.out.println("You need to try to do more homework.");
			}else if(assignments>16) {
				System.out.println("You did an amazing job!");
			}else if(assignments>10) {
				System.out.println("You did good, but you should do more.");
			}
		}else {
			System.out.println("Please make sure you do your homework.");
		}

	}

}
