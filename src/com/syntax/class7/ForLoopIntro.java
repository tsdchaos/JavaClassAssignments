package com.syntax.class7;

public class ForLoopIntro {

	public static void main(String[] args) {
		//Use For loop if you know how many times ahead of time you need to run the code
		/*for(int i=1; i<=5; i++){
		*}
		* Initialization of the variable, the condition, and the incrementation is set in the start of the loop
		*/
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
		}
		System.out.println("--- print numbers from 1 to 20 ---  ");
		for(int b=1; b<=20; b++){
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("--- print numbers from 100 to 20 ---");
		for(int c=100; c>=20; c--) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("--- print EVEN numbers from 1-50 ---");
		for(int d=2; d<=50; d+=2) {
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println("--- what is the output ??? ---");
		for(int e=1; e<=40; e+=5) {
			System.out.print(e+" ");
		}
	}

}
