package com.lumen.fun;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunDemo {
	public static void main(String[] args) {
		
		//Consumer with lambda Expressions
//		Consumer<String> consumer=(str)->System.out.println(str.toUpperCase());
//		consumer.accept("lokesh");
//		consumer.accept("rakesh");
//		
//		Consumer<Integer> consumer2=(name)->System.out.println(name);
//		consumer2.accept(10);;
//		consumer2.accept(20);
		
		
		//Consumer With Book Object
		
//		Consumer<Book> consumer=(book)->System.out.println(book);
//		consumer.accept(new Book("Java","James","Tech",9000,233.33));
//		consumer.accept(new Book("python","lokesh","core",90230,627162.33));
//		
//		
//		Consumer<Book> consumer=(book)->System.out.println(book.getTitle());//by title
//		consumer.accept(new Book("Java","James","Tech",9000,233.33));
		
//		Supplier for Strings
		
//		Supplier<String> supplier=()->"hello".toUpperCase();
//		String result=supplier.get();
//		System.out.println(result);
//
		// Supplier for Integer
//		Supplier<Integer> supplier1=()->100;
//		Integer result1=supplier1.get();
//		System.out.println(result1);
//		
		
		Supplier<Book> supplier=()->new Book("Java","James","Tech",9000,233.33);
		
		Book result=supplier.get();
		System.out.println(result);
	}
}
