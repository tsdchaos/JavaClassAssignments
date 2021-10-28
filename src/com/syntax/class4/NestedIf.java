package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		int dose=2;
		if(vaccine) {
			System.out.println("How many doses have you taken?");
			if(dose==1) {
				System.out.println("When are you taking your second dose?");
			}else System.out.println("You are fully vaccinated!");
		}else System.out.println("Get the fucking vaccine, you dipshit.");
		
		System.out.println("--------------------------------");
		String day="Saturday";
		int date=13;
		int time=24;
		if(day.equals("Friday")) {
			System.out.println("I am going to the movies today");
			if (date==13) {
				System.out.println("I am going to watch a scary movie.");
			}else {
				System.out.println("I am watching a comedy today.");
			}
		}
			else{
				System.out.println("I am going to study");
				if (time>23) {
					System.out.println("I have to go to sleep cause I have class in the morning.");
				}
			}
		
		
		
		
/*		String userName="TSDChaos";
*		String passWord="Somerandombullshit";
*		if(userName.equals("TSDChaos")) {
*			if(passWord.equals("Somerandombullshit")) {
*				System.out.println("Welcome, Alan.");
*			}else System.out.println("Wrong username/password, please try again.");
*		}else System.out.println("Wrong username/password, please try again.");
*/		
	}

}
