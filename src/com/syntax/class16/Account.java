package com.syntax.class16;

public class Account {

	private String userName;
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance=10;
	//you can make these variables semi-accessible by making the method they are used
	//in, public
	public void setUserName(String AccountUserName) {
		if(AccountUserName.length()<16) {
			userName=AccountUserName;
		}else {
			System.out.println("UserName of this length is not allowed");
		}
	
	}
	public void setPassword(String accountPass) {
		if(accountPass.length()<16) {
			password=accountPass;
		}else {
			System.out.println("password of this length is not allowed");
		}
	}
	public void getBalance(String accountusername, String accountPassword) {
		if(userName.equals(accountusername)&&password.equals(accountPassword)) {
			System.out.println(accountBalance);
		}else {
			System.out.println("UserName or password is not correct");
		}
	}
}
