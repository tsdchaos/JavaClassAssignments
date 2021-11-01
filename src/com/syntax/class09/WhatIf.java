package com.syntax.class09;

public class WhatIf {

	public static void main(String[] args) {
		for(int i=1; i<3; i++) {
			for(int j=0; j<=2; j++) {
				System.out.println("Hello");
			}
			System.out.println("Good morning");
			break;
		}
		for(int i=1; i<3; i++) {
			for(int j=1; j<=2; j++) {
				if(j==1) {
					continue;
				}
				System.out.println("Hello");
			}
			System.out.println("Good morning");
		}

	}

}
