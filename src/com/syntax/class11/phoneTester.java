package com.syntax.class11;

public class phoneTester {

	public static void main(String[] args) {
		Phone iPhone=new Phone();
		
		iPhone.make="Apple";
		iPhone.model="iPhone 10x";
		iPhone.RAM=32;
		iPhone.CPU=3.2;
		iPhone.color="Black";
		iPhone.year=2019;
		iPhone.takePictures();
		
		Phone pixel=new Phone();
		pixel.make="Google";
		pixel.model="Pixel 5";
		pixel.RAM=16;
		pixel.CPU=2.8;
		pixel.color="White";
		pixel.year=2021;
		pixel.battery();
		Phone nokia=new Phone();
		nokia.make="Nokia";
		nokia.model="Flip";
		nokia.RAM=32;
		nokia.CPU=3.4;
		nokia.color="Pink";
		nokia.year=2020;
		nokia.battery();
	}

}
