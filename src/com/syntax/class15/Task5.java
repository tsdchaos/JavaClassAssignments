package com.syntax.class15;

public class Task5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		String str="aba";
		StringBuilder strB=new StringBuilder(str);
		strB.reverse();
		String strA;
		strA=strB.toString();
		System.out.println(strB);
		if(str.equals(strA)) {
			System.out.println("String is a palindrome");
		}
		boolean palin;
	    if(str.equals(strB)){
	      palin=true;
	    }else{
	      palin=false;
	    }
	    System.out.println(palin);
	}

}
