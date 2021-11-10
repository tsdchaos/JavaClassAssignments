package com.syntax.class11;

public class Phone {
		//Create a Class "Phone". Create 3 Objects of it: iPhone, Google Pixel, Nokia
		// with specific attributes and behaviors
		String make;
		String model;
		int RAM;
		double CPU;
		String color;
		int year;
		
		void takePictures(){
			System.out.println(make+" "+model+" is taking a picture");
		}
		void battery() {
			System.out.println(make+" "+model+" has an ok battery life.");
		}

}
