package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		String[][] names= {
				{"Mr", "Mrs", "Ms", "Miss" },
				{"Smith", "Jordan", "Jackson", "Obama"}};
	//Mrs. Smith, Mr. Obama, Ms Jackson, Miss Jordan	
		System.out.print(names[0][1]+" "+names[1][0]+", ");
		System.out.print(names[0][0]+" "+names[1][3]+", ");
		System.out.print(names[0][2]+" "+names[1][2]+", ");
		System.out.print(names[0][3]+" "+names[1][1]);
	}

}
