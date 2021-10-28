package com.syntax.class6;

public class SwitchDemo {

	public static void main(String[] args) {
		/* rule:
		 * 1. values in case must be same datatype as a variable in switch
		 * 2. We can not have duplicate cases
		 */
		char gender='m';
		String description=null;
		switch(gender) {
			case 'm':
				description="Male";
				break;
			case 'f':
				description="Female";
				break;
			default:
				description="Unknown";
				break;				
		}
		System.out.println(gender+" means "+description);
		/*
		 * limitation: cannot use || or && with switch case
		 * switch case only checks for equality, not conditions
		 * boolean conditions can't be used in switch case
		 * cannot use double/float
		 * cannot be used with long
		 */

	}

}
