package com.syntax.class4;

public class ifStatementRecap {

	public static void main(String[] args) {
		/* autocomplete:
		 * sysout+ctrl+space will autocomplete System.out.println();
		 * main+ctrl+space will autocomplete main statement public static void main(String[] args){
		 */
		int day=6;
		if (day==6){
			System.out.println("Today is Saturday");
			System.out.println("We are having Java class");
		}else {
			System.out.println("Today sucks");
		}
		System.out.println("-------------------");
		if (day==6)
			System.out.println("today is Saturday");
		//System.out.println("We are having Java class");
		// when using "if statements" without {}, then only the next command is assigned to the "if statemtn"
		else 
			System.out.println("Today is not Saturday");
		System.out.println("Today is some other day");
	}

}
