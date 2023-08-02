package com.lumen.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncDemo {

	public static void main(String[] args) {
		//Function<String(input),Output(any datatype)> 
//		Function<String, Integer> function=(str)->str.length();
//		System.out.println(function.apply("lokesh"));
//		
//		Function<String, String> function1=(str)->str.toUpperCase();
//		System.out.println(function1.apply("lokesh"));
//		
//		Function<Book, String> function2=(str)->str.getTitle();
//		System.out.println(function2.apply(new Book("Java","James","Tech",9000,233.33)));
//	
//		Function<String , Book> function3=(title)->{
//			if(title.equals("Java")) {
//				return new Book();
//			}
//			else {
//				return null;
//			}
//		};
//		System.out.println(function3.apply("Java"));
//		
//		
//		
//		Function<Integer,List<String>> function4=(number)->{
//			if(number==1) {
//				return Arrays.asList("lokesh","rakesh");
//			}
//			else {
//				return null;
//			}
//		};
//		System.out.println(function4.apply(1));
		
		
		//Predicate(Boolean)-->test()
		
		Predicate<String>  predicate=(str)->{
			if(str.equals("lokesh"))
			{
				return true;
			}
			else {
				return false;
			}
			
		};
		System.out.println(predicate.test("lokeh"));
		//BiPredicate(two Variables)
		
		
		BiPredicate<String,Integer>  predicate1=(str,num)->{
			if(str.length()==num)
			{
				return true;
			}
			else {
				return false;
			}
			
		};
		
		System.out.println(predicate1.test("lokesh",6));
	}

}
