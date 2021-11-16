package com.syntax.class17;

public class Task3 {
	public Task3(String name) {
		System.out.println("hello");
	}
	private Task3(String name, int age) {
		System.out.println("Hello");
	}
	protected Task3(String name, int age, int height) {
		System.out.println("Hello");
	}
	Task3(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Task3 task3Pub=new Task3("Alan");
		Task3 task3Priv=new Task3("Alan", 32);
		Task3 task3Prot=new Task3("Alan");
		Task3 task3Def=new Task3("Alan");
	}
}
