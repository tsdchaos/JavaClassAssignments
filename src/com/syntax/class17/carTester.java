package com.syntax.class17;

public class carTester {
	public static void main(String[] args) {
		Car car=new Car("Tesla model x", "Tesla", "Model Y", "Black", 
				2019, -1, 50000, 120, true, "ASJDJDIW23814"); 
		car.printName();
		// above object calls the multi-var constructor
		Car car2=new Car("Tesla Model X");
		car2.printName();
		Car car3=new Car();
		car3.sayHello();
		
	}
}
