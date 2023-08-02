package com.lumen.objbasics;

public class Book {
	String title;
	String author;
	double Price;
	
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.Price = price;
	}
	void printdetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(Price);
	}
	double getDiscountedPrice(double amount) {
		return Price-amount;
	}
	void CheckBookType() {
		if(Price>500) {
			System.out.println("Premium");
		}
		else {
			System.out.println("Standard Book");
		}
	}
	
	

}