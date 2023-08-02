package com.lumen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> optional= Arrays.asList("java","sql")
				.stream()
				.filter(str->str.length()>6)
				.findFirst();
//				.get();
//		if(optional.isEmpty())
//		System.out.println(optional.get());
//		
////		if(optional.isPresent())
////			System.out.println(optional.get());//noSuchElementException
////		
//		optional.ifPresent(System.out::println);
		String optional1= Arrays.asList("java","sql")
				.stream()
				.filter(str->str.length()<6)
				.findFirst()
//				.get()-->If no throws exception
				.orElse("No Courses");
		
		System.out.println(optional1);
		
		String optional2= Arrays.asList("java","sql")
				.stream()
				.filter(str->str.length()>6)
				.findFirst()
//				.get()-->If no throws exception
				.orElseGet(()->"No Courses");
		
		System.out.println(optional2);
		String optional3= Arrays.asList("java","sql")
				.stream()
				.filter(str->str.length()>6)
				.findFirst()
//				.get()-->If no throws exception
				.orElseThrow(()->new RuntimeException("No Value"));
		
		System.out.println(optional3);
	}

}
