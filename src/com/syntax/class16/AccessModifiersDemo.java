package com.syntax.class16;

public class AccessModifiersDemo {

	private String name; //when adding the private keyword, that field can only be accessed to the methods of the class (works for variables and methods)
	int age; //adding no keyword means the variable/method can be accessed in the package
	public double salary; //adding public means the variable/method can be accessed from outside the package as well
	
	void displayName() {
		System.out.println(name);
	}
	void displayAge() {
		System.out.println(age);
	}

	void displaySalary() {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		AccessModifiersDemo am=new AccessModifiersDemo();
		am.name="Nabil";
		am.age=32; 
		am.salary=125000;
			
	}
}
