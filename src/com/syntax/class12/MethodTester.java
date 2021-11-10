package com.syntax.class12;

public class MethodTester {

	public static void main(String[] args) {
		System.out.println("Line before method call");
		Methods methods=new Methods();
		//methods.sayHello();
		
		
		//methods.sayHelloManyTimes();
		methods.times=3;
		//methods.sayHelloManyTimesWithState();
		System.out.println("Line after method call");
		
		methods.sayHelloManyTimesWithParameter(8);
	}

}
