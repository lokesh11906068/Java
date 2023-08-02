package com.lumen.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class BookMain {

	public static void main(String[] args) {
//		Book book1=new Book("java","markram",1002.22);
//		Book book2=new Book("Sql","My",122.2);
//		Book book3=new Book("UI","markram",456.7);
		List<Book> books=Arrays.asList(
				new Book("java","markram",1002.22),
				new Book("sI","markram",456.7),
				new Book("uql","My",122.2)
				);
		
		
		System.out.println("Before sorting:");
		for(Book book:books) {
			System.out.println(book);
		}
		Collections.sort(books);
		
		System.out.println("After sorting:");
		for(Book book:books) {
			System.out.println(book);
		}
//		List<Book> bookByAuthor=new ArrayList<Book>();
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);
//		
//		String author="markram";
//		for(Book book:books) {
//			if(book.getAuthor().equals("markram")) {
//			bookByAuthor.add(book);
//			}
//		}
//		ListIterator<Book> listIterator1=bookByAuthor.listIterator();
//		while(listIterator1.hasNext()) {
//			Book book=listIterator1.next();
//			System.out.println(book);
//		}
//		
//		System.out.println("\n");
//		
//		ListIterator<Book> listIterator=books.listIterator();
//		while(listIterator.hasNext()) {
//			Book book=listIterator.next();
//			System.out.println(book);
//		}
		
		
		
	}

}
