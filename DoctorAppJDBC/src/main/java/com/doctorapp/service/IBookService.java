package com.doctorapp.service;

import java.util.List;



import com.doctorappapp.exceptions.BookNotFoundException;
import com.doctorapp.model.Book;

public interface IBookService {
	//void addBook(Book book);
	
	//crud operation
	void addBook(Book book);
	void updateBook(int bookId,double price);
	void deleteBook(int bookId);

	
	
	List<Book> findAll();
	List<Book> getByAuthorContains(String author) throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author,String category) throws BookNotFoundException;
	List<Book> getById(int bookid) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;


	
	

}
