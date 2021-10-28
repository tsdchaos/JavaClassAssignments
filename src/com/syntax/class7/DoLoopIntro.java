package com.syntax.class7;

public class DoLoopIntro {

	public static void main(String[] args) {
		/*
		 * do{
		 * 		code to repeat;
		 * }while();
		 */
		int a=1;
		System.out.println("----- CODE WITH WHILE LOOP -----");
		while(a>=3) { //if the condition is false, the loop doesn't get entered at all
			System.out.println("Hello");
		a++;
		}
		System.out.println("----- CODE WITH DO/WHILE LOOP -----");
		int b=1;
		do { //enters the block once, since there is no condition. Only checks condition for repeating purposes
			System.out.println("Bye");
			b++;
		}while(b<=3);

	}

}
