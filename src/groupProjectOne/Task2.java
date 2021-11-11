package groupProjectOne;

public class Task2 {
	public static void main(String[] args) {

		int num[][] = { { 20, 400, 13, 27, 24 }, { 3, 133, 12, 14, 5 },

		};
		for (int[] n : num) {
			for (int c : n) {
				if (c % 2 == 0) {
					System.out.println(" even number is " + c);

				}

			}

		}
	}
}