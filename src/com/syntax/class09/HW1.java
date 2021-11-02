package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		String cars[]= new String[6];
		cars[0]="Hyundai Sonata";
		cars[1]="Honda Fit";
		cars[2]="Toyota Corrola";
		cars[3]="Ford F150";
		cars[4]="Honda Civic";
		cars[5]="Mini Cooper";
		for(String n:cars) {
			System.out.println(n);
		}
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
