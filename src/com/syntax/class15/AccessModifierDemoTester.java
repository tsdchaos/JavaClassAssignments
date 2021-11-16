package com.syntax.class15;

import com.syntax.class16.AccessModifiersDemo;

public class AccessModifierDemoTester {
	public static void main(String[] args) {
		
	AccessModifiersDemo am=new AccessModifiersDemo();
	//am.name="Nabil"; not accessible because the variable is private, and this is another package
	// am.age=32; //not accessible because the varibale is default, and this is another package
	am.salary=125000; //the variable is public, and thus accessible
	
	}
}
