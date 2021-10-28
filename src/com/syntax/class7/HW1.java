package com.syntax.class7;

public class HW1 {

	public static void main(String[] args) {
		int oddTotal=0;
		int evenTotal=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				evenTotal+=i;
			}else {
				oddTotal+=i;
			}
		}
		System.out.println("Total of all even numbers is: "+evenTotal);
		System.out.println("Total of all odd numbers is: "+oddTotal);

	}

}
