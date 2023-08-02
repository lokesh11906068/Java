package com.lumen.client;

import java.util.ArrayList;
import java.util.List;

import com.lumen.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class BookMain {

	public static void main(String[] args) {
		IBookService bookservice=new BookServiceImpl();
		List<Book> books=new ArrayList<>();
		books=bookservice.getAll();
		System.out.println(books);
		
		books=bookservice.getByAuthorContains("Ben john");
		System.out.println(books);
		
		books=bookservice.getByCategory("Tech");
		System.out.println(books);
		
		
	}

}
