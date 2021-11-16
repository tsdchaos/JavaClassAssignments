package com.syntax.class17;

public class Task1 {
	//Write a java class that will have a constructor: one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors 1 by 1.
	private String name=null;
	private int age=0;
	public Task1(String name, int age){
		this.name=name;
		this.age=age;
		printAllInfo();
	}
	public Task1(){
		printAllInfo();
	}
	public void printAllInfo() {
		System.out.println("name "+name+"\nage "+age);
	}
}
