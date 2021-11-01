package com.syntax.class8;

public class HW2PrintNums {

	public static void main(String[] args) {
		for(int num1=1; num1<=50; num1++) {
			if(num1%3==0){
				continue;
			}
			System.out.print(num1+" ");
		}

	}

}
