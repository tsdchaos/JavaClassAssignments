package com.syntax.class12;

public class Method4Tester {

	public static void main(String[] args) {
		Method4 canBeAnyName=new Method4(); //calls the class
		canBeAnyName.method1();
		System.out.println();//wont print anything since there is no print method in method1()
		System.out.println(canBeAnyName.method1()); //allows to print the return
		String name=canBeAnyName.method1(); //assigns the method to the variable
		System.out.println(name);
		System.out.println(canBeAnyName.method2("Roman"));
		
	}

}
