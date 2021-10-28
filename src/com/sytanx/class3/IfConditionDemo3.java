package com.sytanx.class3;

public class IfConditionDemo3 {
	public static void main(String[] args) {
		
		int temp=60;
		if(temp>=60) {
			System.out.println("I am going to the beach.");
		}
		else {
			System.out.println("I will for a walk.");
		}
		String userName="Alan";
		String password="pass123";
		// for Strings onl == and != are allowed, but not recommended.
		if(userName.equals("Alan")) {
			System.out.println("Hi Alan");
			if(password.equals("pass123")) {
				System.out.println("Welcome.");
			}else { System.out.println("Wrong password.");}
		}
		else {
			System.out.println("I don't know you.");
		}
	}
}
