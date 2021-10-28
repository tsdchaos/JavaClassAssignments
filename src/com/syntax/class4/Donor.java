package com.syntax.class4;

public class Donor {

	public static void main(String[] args) {
		int age=32;
		int weight=210;
		
		if(age>18) {
			if(weight>=110) {
				System.out.println("You are eligible to donate blood.");
			}else {
				System.out.println("You do not match the requirements to be able to donate blood.");
			}
		}else {
			System.out.println("You do not match the requirements to be able to donate blood.");
		}

	}

}
