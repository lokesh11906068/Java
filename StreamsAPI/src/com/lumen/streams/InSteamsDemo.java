package com.lumen.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InSteamsDemo {

	public static void main(String[] args) {
		
//		Predicate<String> predicate=(str)->str.length()>5;
//		List<String> courses=Arrays.asList("java","angular","javascript","node","node","react","css","html");
//		
//		Iterator<String> iterator=courses.stream()
//										.filter(str->str.length()>3)
//										.skip(3)
//										.distinct()
//										.limit(2)
//										.iterator();
//		while(iterator.hasNext()) {
//			String coursename=iterator.next();
//			System.out.println(coursename);
//		}
		
		//Stream with consumer anf for Each
//		Consumer<String> predicate1=(str)->System.out.println(str.toUpperCase());;
//		List<String> courses=Arrays.asList("java","angular","javascript","node","node","react","css","html");
//		
//		courses.stream()
//						.filter(str->str.length()>3)
//						.skip(2)
//						.distinct()
//						.limit(3)
//						.filter(str->str.contains("node"))
//						.forEach(predicate1);
		
		
//		Consumer<String> predicate2=(str)->System.out.println(str.toUpperCase());;
//		List<String> courses=Arrays.asList("java","angular","javascript","node","node","react","css","html");
//		
//		List<Integer> ncourses=courses.stream()
//						.sorted()
//						.map(str->str.length())
//						.filter(num->num==10)
//						.collect(Collectors.toList());
//		
//		ncourses.forEach(num->System.out.println(num));
		
		Consumer<String> predicate3=(str)->System.out.println(str.toUpperCase());;
		List<String> courses=Arrays.asList("java","angular","javascript","nodes","node","react","css","html");
		
		List<Integer> ncourses=courses.stream()
						.sorted()
						.map(str->str.length())
						.filter(num->num%2==0)
						.collect(Collectors.toList());
		
		ncourses.forEach(num->System.out.println(num));
	}

}
