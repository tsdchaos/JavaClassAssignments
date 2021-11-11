package groupProjectOne;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		// Create an array on double values using scanner and calculate the sum
		// of all stored elements in that array.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your numbers");

		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		double number3 = scan.nextDouble();
		double number4 = scan.nextDouble();

		double[] arrayNums = { number1, number2, number3, number4 };
		double sum = 0.0;

		for (double nums : arrayNums) {
			sum = sum + nums;
		}
		System.out.println("Sum of array elements is:" + sum);
	}
}