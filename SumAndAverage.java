package com.lumen.basic;

public class SumAndAverage {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		int sum=0;
		int average;
		for(int arr:array) {
			sum+=arr;
		}
		average=sum/array.length;
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+average);
	}

}
