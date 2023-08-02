package com.lumen.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateBookSteamsDemo {
	//create a list of books->Convert to stream->get books by author->print
	
	public static void main(String[] args) {
//		List<Book> books=Arrays.asList(new Book("java","kathy","tech",100,223.9),
//				new Book("sql","john","data",130,2233.29),
//				new Book("spring","kathy","tech",110,2223.9)
//				);
//		
//		books.stream()
//					.filter(book->book.getAuthor().equals("kathy"))
//					.map(book->book.getTitle())
//					.forEach(title->System.out.println(title));		
//	}
	List<Book> books=Arrays.asList(new Book("java","kathy","tech",100,223.9),
			new Book("sql","john","data",130,2233.29),
			new Book("spring","kathy","tech",110,2223.9)
			);
	
	List<Integer>list=books.stream()
				.map(title->title.getTitle())
				.map(title->title.length())
				.map(num->(int)Math.pow(num, 2))
				.collect(Collectors.toList());
	System.out.println(list);
	
	//or
	List<Integer> list1=books.stream()
			.map(book->(int)Math.pow(book.getTitle().length(), 2))
			.collect(Collectors.toList());
		System.out.println(list1);
	
}

}
