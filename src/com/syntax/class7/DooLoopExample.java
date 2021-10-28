package com.syntax.class7;

import java.util.Scanner;
import java.util.Random;

public class DooLoopExample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		/*
		 * Let's create a secret number (1-100)
		 * let's ask the user to guess the number
		 */
		int upperLimit=101;
		Random rand=new Random();
		int secret=rand.nextInt(upperLimit);
		int guess;
		int numOfGuess=0;
		System.out.println("Guess a number, from 1 to 100");
		do {
			guess=input.nextInt();
			if(guess>secret) {
				System.out.println("Too high! Guess again.");
			}else if(guess<secret) {
				System.out.println("Too low! Guess again.");
			}else {
				System.out.print("Bingo!");
			}
			numOfGuess++;
		}while(guess!=secret);
		System.out.println("It took you "+numOfGuess+" tries!");

	}

}
