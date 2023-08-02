package com.lumen.objbasics;


public class BookMain {

	public static void main(String[] args) {
		Book book1=new Book("Girl in the room no 107","Chethan bagat",499);
		Book book2=new Book("The Alchemist","Paulo Choelo",3000.0);
		book2.printdetails();
		book1.CheckBookType();	
	}

}
