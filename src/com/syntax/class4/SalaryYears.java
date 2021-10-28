package com.syntax.class4;

import java.util.Scanner;

public class SalaryYears {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		System.out.println("How many years have you worked here?");
		int year=user.nextInt();
		if(year>=5) {
			System.out.println("What is your current salary?");
			int salary=user.nextInt();
			if(salary>50000) {
				System.out.println("Congratulations, you are eligible for a $5000 bonus!");
			}else {
				System.out.println("Congratulations, you are eligible for a $3000 bonus!");
			}
		}else {
			System.out.println("Unfortunately, you are not eligible for the bonus this year.");
		}

	}

}
