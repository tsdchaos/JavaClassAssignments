package com.syntax.class4;

public class BuyHomeTask2 {

	public static void main(String[] args) {
		double rate=3.7;
		int price=456000;
		
		if (rate<4.5) {
			System.out.println("I think it is time to buy a house.");
			if (price>200000) {
				System.out.println("I will need a loan to afford one.");
			}else {
				System.out.println("Fortunately, I can afford to pay cash.");
			}
		}else {
			System.out.println("I will not buy a house yet. The rate is too high.");
		}
	}

}
