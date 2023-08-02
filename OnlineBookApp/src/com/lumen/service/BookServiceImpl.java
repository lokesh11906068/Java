package com.lumen.service;

import java.util.ArrayList;
import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.util.BookDetails;

public class BookServiceImpl implements IBookService{

	

	@Override
	public List<Book> getAll() {
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> getbyauthorcontains=new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthor().equals(author)) {
				getbyauthorcontains.add(book);
			}
		}
		//if(getbyauthorcontains.size()==0) {
		//	return ;
		//}
		return getbyauthorcontains;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> getbycategory=new ArrayList<>();
		for(Book book:books) {
			if(book.getCategory().equals(category))
				getbycategory.add(book);
			
		}
		
		return getbycategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> getbypricelessthan=new ArrayList<>();
		for(Book book:books) {
			if(book.getPrice()>=price) {
				getbypricelessthan.add(book);
				
			}
		}
		return getbypricelessthan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> getbyauthorcontainsandcategory=new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthor().equals(author)){
				if(book.getCategory().equals(category)) {
					getbyauthorcontainsandcategory.add(book);
					
				}
			}
		}
		
		return getbyauthorcontainsandcategory;
	}

	@Override
	public Book getById(int bookid) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getbyid=new ArrayList<>();
		for(Book book:books) {
			if(book.getBookId().equals(bookid)){
				getbyid.add(book);
			}
		}
		return (Book) getbyid;
	}

}
