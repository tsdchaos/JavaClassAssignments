package com.syntax.class4;

public class DiplomaCheckTask1 {

	public static void main(String[] args) {
		boolean diploma=true;
		double gpa=3.9;
		if(diploma) {
			System.out.println("Congratulations!");
			if(gpa>=3.5) {
				System.out.println("You are eligible for a scholarship!");
			}else {
				System.out.println("You should have studied harder.");
			}
		}else {
			System.out.println("I recommend you get a degree.");
		}

	}

}
