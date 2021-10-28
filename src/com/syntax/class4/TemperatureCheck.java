package com.syntax.class4;

import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("What city do you live in?  A: ");
		String city=input.next();
		System.out.print("What is the temperature, in Fahrenheit?  A: ");
		int tempF=input.nextInt();
		int tempC=((tempF-32)*5/9);
		System.out.println("The temperature in the city of "+city+" is "+tempC+" degress Celcius.");

	}

}
