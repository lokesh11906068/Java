package com.lumen.util;

import java.util.Arrays;
import java.util.List;

import com.lumen.model.Book;

public class BookDetails {
	public static List<Book> showBooks(){
		 return Arrays.asList(new Book("java in action","John david","Tech",1,900.0),
				new Book("5 am club","Robin","Selfhelp",2,300.68),
				new Book("HTML","Ben john","Tech",3,1900.45),
				new Book("Secret Seven","Enid Ben","Fiction",4,700.08),
				new Book("Seven habits","Richad","Drama",5,600.98));
				
	}

}
