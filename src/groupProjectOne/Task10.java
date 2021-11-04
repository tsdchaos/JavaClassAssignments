package groupProjectOne;

import java.util.Arrays;

public class Task10 {
	public static void main(String[] args) {
		int numbers[] = { 67, 23, 444, -10, 990 };
		
		Arrays.sort(numbers);
		System.out.println("Largest number is " + numbers[numbers.length-1]);
		System.out.println("Largest number is " + numbers[numbers.length-2]);
	}
}
