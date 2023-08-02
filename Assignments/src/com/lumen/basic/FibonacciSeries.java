package com.lumen.basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=10;
		int first=0;
		int second =1;
		int sequence_number =1;
		for(int i=1;i<= counter ;i++) {
			System.out.println(sequence_number);
			sequence_number = first+second;
			first = second;
			second = sequence_number;
		}
	}

}
