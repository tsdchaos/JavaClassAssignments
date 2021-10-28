package com.syntax.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String country;
		String language=null;
		System.out.println("What country do you live in?");
		country=input.next();
		switch(country.toLowerCase()) {
			case "mexico": 
			case "spain":
			case "argentina":
				language="Spanish";
			break;
			case "england": 
			case "usa":
			case "canada":
			case "australia":
				language="English";
			break;
			case "france": language="French";
			break;
			case "russia": language="Russian";
			break;
			case "germany": language="German";
			break;
			case "china": language="Chinese";
			break;
			case "japan": language="Japanese";
			break;
			default: language="Other";
		}
		if(language.equals("Other")) {
			System.out.println("Please enter another country.");
		}else {
		System.out.println("If you live in "+country+" then you most likely speak "+language);
		}
	}

}
