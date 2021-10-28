package com.sytanx.class3;

public class IfConditionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double chocolatePrice=5.99;
		double moneyIHave=5.99;
		
		if(moneyIHave>=chocolatePrice) {
			System.out.println("I am happy that I have chocolate!");
			if(moneyIHave>chocolatePrice) {
				double moneyLeft=moneyIHave-chocolatePrice;
				System.out.println("I have $"+moneyLeft+" left over.");
			}
			else { System.out.println("I have no money left.");}
		}else {
			System.out.println("I am sad.");
		}
	}

}
