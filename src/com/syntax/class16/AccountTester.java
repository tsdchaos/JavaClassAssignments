package com.syntax.class16;

public class AccountTester {

	public static void main(String[] args) {
		Account account=new Account();
		//account.balance=123455; //does not work, as balance is a private variable
		account.setUserName("alan");
		account.setPassword("pass123");
		account.getBalance("alan","pass123");

	}

}
