package com.syntax.class15;

public class SyntaxStudentTester {

	public static void main(String[] args) {
		SyntaxStudent Alan=new SyntaxStudent();
		Alan.name="Alan";
		Alan.id="56987";
		Alan.calculateFee();
		System.out.println(Alan.school);
		System.out.println(SyntaxStudent.school); //access static variables using the name of the class (uses less memory)

	}

}
