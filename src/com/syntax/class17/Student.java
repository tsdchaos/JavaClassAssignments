package com.syntax.class17;

public class Student {
 //Write a Student class that have instance variables name and address. 
 //Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.
	private String name;
	private String address;
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		displayInfo();
	}
	public void displayInfo(){
		System.out.println(name+" lives at "+address);
	}
	public static void main(String[] args) {
		new Student("Alan", "Clover Ct");
	}
	

}
