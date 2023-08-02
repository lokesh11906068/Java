package com.lumen.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatDemo {
public static void main(String[] args) {
	String[] names= {"lokesh","rakesh","chitti","Siddu","chandu"};
	Arrays.stream(names).forEach(name->System.out.println(name));
	
	String [][]courses={{"java","sql"},{"node","angular"},{"HTML","CSS"}};
	System.out.println("\n");
//	Stream.of(courses).forEach((array)->{
//		for(String name:array)System.out.println(name);
//	});
	Arrays.stream(courses)
			.flatMap((array)->Arrays.stream(array))
				.map(String::toUpperCase)
					.filter(str->str.length()>3)
					.forEach(System.out::println);
	
	
}
}
