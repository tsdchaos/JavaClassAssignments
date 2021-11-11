package groupProjectOne;

public class Task1 {
	public static void main(String[] args) {

		int[][] m = { { 6, 8, 2 }, { 4, 5, 7 }, { 3, 9, 3 }, { 8, 3, 7 } };
		int sum = 0;
		int total = 0;

		for (int d = 0; d < m.length; d++) {
			for (int b = 0; b < m[d].length; b++) {
				sum += m[d][b];
				total += m[d][b];
			}
			System.out.println(sum + " ");
			sum = 0;

		}
		System.out.print("The total of all arrays are " + total);
	}
}
