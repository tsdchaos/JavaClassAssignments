package com.syntax.class12;

public class HW3Method {
	String country;
	String hello;
	 void printHello(){
		 if(country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("England")) {
			 hello="Hello";
		 }else if(country.equalsIgnoreCase("Spain") || country.equalsIgnoreCase("Mexico")){
			 hello="Hola";
		 }else if(country.equalsIgnoreCase("France") || country.equalsIgnoreCase("Canada")) {
			 hello="Bonjour";
		 }
		 System.out.println(hello);
	 }
}
