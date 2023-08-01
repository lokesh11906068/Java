package com.lumen.scan;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int arraySize=sc.nextInt();
		int[] array=new int[arraySize];
		System.out.print("Elements:");
		for(int i=0;i<arraySize;i++)
			array[i]=sc.nextInt();
		int sum=0;
		for(int i:array)
			sum+=i;
		System.out.println("Sum: "+sum);
		double average=sum/arraySize;
		System.out.println("Average: "+average);
			
	}

}
