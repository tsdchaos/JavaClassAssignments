package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 4; c++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("how to print a square 10x10");
		for (int r = 1; r <= 10; r++) {
			for (int c = 1; c <= 10; c++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("Print a square of numbers");
		for (int r = 5; r >= 1; r--) {
			for (int c = 1; c <= 4; c++) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}

}
