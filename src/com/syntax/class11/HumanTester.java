package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human alan=new Human();
		alan.name="Alan";
		alan.age=32;
		alan.height=70;
		alan.weight=215;
		alan.gender='M';
		alan.bloodType="O+";
		
		alan.eat();
		alan.sleep();
		alan.walk();
		alan.sendMemes();
		Human sebastian=new Human();
		sebastian.name="Sebastian";
		sebastian.age=18;
		sebastian.height=67;
		sebastian.weight=180;
		sebastian.gender='M';
		sebastian.eat();
		sebastian.sendMemes();
		Scanner input=new Scanner(System.in);
		
	}

}
