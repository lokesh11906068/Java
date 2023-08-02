package com.lumen.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {

	//use stream methid for listes
	//use Stream.of for String Arrays and user defined array
	//use Arrays.stream for primitive types
	
	public static void main(String[] args) {
		String[] names=new String[] {"Ram","John","Sri","lokesh","rakesh","chitti"};
		//create stream form array
		
		Stream.of(names).forEach(name->System.out.println(name));
		System.out.println("\n");
		Arrays.stream(names).forEach(name->System.out.println(name));
		
		int[] nums= {10,20,20,40};
		
		int sum=Arrays.stream(nums,0,3)
					.filter(num->num%2==0)
						.sum();
					
		System.out.println(sum);
		
		IntStream stream =Arrays.stream(nums,1,4);
					double sum1=stream.mapToObj(num->String.valueOf(num))
					.mapToDouble(str->Double.parseDouble(str))
					.sum();
					System.out.println(sum1);
					
		Arrays.stream(nums,1,4)
					.map(num->(int)Math.pow(num,2))//convert to primitive
					.forEach(n->System.out.println(n));
			
					
		
		//Create infinite stream with generate and we can set limit()
		Stream.generate(()->"hello").limit(3).forEach(System.out::println);

	}

}
