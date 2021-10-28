package com.syntax.Class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		boolean understandJava=true;
		boolean enjoyJava=false;
		if(understandJava && enjoyJava) { //&& is used to set a second condition that must be met in the if statement
			System.out.println("That is awesome!");
		}else {
			System.out.println("You probably need to study more.");
		}
		
	}

}
