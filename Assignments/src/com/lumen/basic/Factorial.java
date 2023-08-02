package com.lumen.basic;

public class Factorial {

	public static void main(String[] args) {
		int number=16;
		long factorial=1;
		while(number>0) {
			factorial*=number;
			number--;
		}
		System.out.println(factorial);
	}

}
