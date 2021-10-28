package com.syntax.class7;

public class ForDemo2 {

	public static void main(String[] args) {
		for(int a=1; a<=10; a++) {
			System.out.println("Multiplication table, base "+a);
			for(int b=1; b<=10; b++) {
				int c=a*b;
				System.out.println(a+"x"+b+"="+c+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=1; i<=6; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
