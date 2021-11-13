package com.syntax.class15;

public class Students {

	String studentName;
	int studentID;
	static int numberOfStudents=0;
	
	public static void main(String[] args) {
		
		Students st1=new Students();
		st1.studentName="Jack";
		st1.studentID=879;
		numberOfStudents++;
		
		Students st2=new Students();
		st2.studentName="Aysha";
		st2.studentID=928;
		numberOfStudents++;
		
		Students st3=new Students();
		st3.studentName="Alan";
		st3.studentID=742;
		numberOfStudents++;
		
		System.out.println(numberOfStudents);
		
		
		
		
	}
}
