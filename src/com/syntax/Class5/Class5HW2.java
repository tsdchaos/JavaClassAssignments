package com.syntax.Class5;

import java.util.Scanner;

public class Class5HW2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int grade1=0;
		int grade2=0;
		int grade3=0;
		System.out.println("All inputs should be from 0-100.");
		System.out.println("What was your grade on your quiz?");
		grade1=input.nextInt();
		System.out.println("What was your grade on your midterm?");
		grade2=input.nextInt();
		System.out.println("What was your grade on your final?");
		grade3=input.nextInt();
		String letterGrade;
		int finalGrade = (grade1+grade2+grade3)/3;
		if(finalGrade>=90 && finalGrade<=100) {
			letterGrade="A";
		}else if (finalGrade>=70 && finalGrade<90) {
			letterGrade="B";
		}else if (finalGrade>=50 && finalGrade<70) {
			letterGrade="C";
		}else if(finalGrade<50) {
			letterGrade="F";
		}else {
			letterGrade="Something went wrong.";
		}
		if(letterGrade.equals("Something went wrong.")) {
			System.out.println(letterGrade);
		}else {
			System.out.println("Your final grade is: "+letterGrade);
		}
	}

}
