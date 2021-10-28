package com.syntax.Class5;

public class LogicalNot {

	public static void main(String[] args) {
		boolean boo=true;
		System.out.println(boo);
		boolean zoo=!false; //by adding ! infront of a value, it changes it to "not" the thing. So in this case, Not False
		System.out.println(zoo);
		boolean isRain=true;
		if(!isRain) { //saying that if isRain is false, the If statement block will be entered
			System.out.println("I will go for a walk!");
		}
		String username="test";
		String password="password";
		if(!username.equals(password)) {
			System.out.println("I am accepting your password.");
		}else {
			System.out.println("Please change your password");
		}
	}

}
