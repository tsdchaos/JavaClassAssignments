package com.syntax.class17;

public class Task3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 task3Pub=new Task3("Alan");
		//Task3 task3Priv=new Task3("Alan", 32); //not visible because it is private
		Task3 task3Prot=new Task3("Alan");
		Task3 task3Def=new Task3("Alan");
	}

}
