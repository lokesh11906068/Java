package com.api.lang;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private long isbnNumber;
	public Book(String title, String author, long isbnNumber) {
		super();
		this.title = title;
		this.author = author;
		this.isbnNumber = isbnNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(isbnNumber, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return isbnNumber == other.isbnNumber
				&& Objects.equals(title, other.title);
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbnNumber=" + isbnNumber + "]";
	}
	
}
