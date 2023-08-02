package com.lumen.custom;

public class Book implements Comparable{
	private String title;
	private String author;
	private double price;
	public Book()  {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getTitle().compareTo(((Book) o).getTitle());
	}
	
}
