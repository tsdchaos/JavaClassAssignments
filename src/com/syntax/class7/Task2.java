package com.syntax.class7;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Print numbers from 1 to 100 in a line");
		for(int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Print numbers from 100 to 1");
		for(int b=100; b>=1; b--) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("Print even numbers from 20 to 1, two different ways");
		for(int c=20; c>=1; c-=2) {
			System.out.print(c+" ");
		}
		System.out.println();
		for(int d=20; d>=1; d--) {
			if(d%2==0) {
				System.out.print(d+" ");
			}
		}
		System.out.println();
		System.out.println("Print odd numbers from 20 to 50, two different ways");
		for(int e=21; e<=50; e+=2) {
			System.out.print(e+" ");
		}
		System.out.println();
		for(int f=20; f<=50; f++) {
			if(f%2==1) {
				System.out.print(f+" ");
			}
		}

	}

}
