package com.syntax.class16;

public class AccessModifierDemoTester {
	public static void main(String[] args) {
		AccessModifiersDemo am=new AccessModifiersDemo();
		//am.name="Nabil"; not accessible because the variable is private, and this is a different class
		am.age=32; 
		am.salary=125000;
			
	}
}
