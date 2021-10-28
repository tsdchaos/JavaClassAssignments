package com.syntax.class6;

public class SwitchIntro {

	public static void main(String[] args) {
				int day=8;
				if(day==1) {
					System.out.println("Monday");
				}else if(day==2) {
					System.out.println("Tuesday");
				}else if(day==3) {
					System.out.println("Wednesday");
				}else if(day==4) {
					System.out.println("Thursday");
					//type sysout then hit ctrl and space to complete the System.out.println command		
				}else if(day==5) {
					System.out.println("Friday");
				}else if(day==6) {
					System.out.println("Saturday");
				}else if(day==7) {
					System.out.println("Sunday");
				}else {
					System.out.println("Wrong day");
				}
				switch(day) { //Switch case is cleaner, and faster to run. Use break to signify the end of a case
				case 1: 
					System.out.println("Monday");
					break; // without break, the code will keep running in the block until it encounters a break, or it reaches the end of the block
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default: //default keyword is basically the "else" statement for switch case, can be anywhere in the block
					System.out.println("Wrong day");
					break;
				}	
			}

		}