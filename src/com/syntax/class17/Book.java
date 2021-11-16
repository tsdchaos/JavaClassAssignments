package com.syntax.class17;

public class Book {
	/*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
	*Instance variables are being initialized
	*Both Constructors are being executed
	*/
	private String title;
	private String author;

	public Book(String title) {
		this.title = title;
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		new Book("Jack is a dumbass");
		new Book("Jack is a dumbass", "Alan S.");
		
	}

	

	
	
}
