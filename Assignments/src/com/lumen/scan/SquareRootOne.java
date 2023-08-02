package com.lumen.scan;

import java.util.Scanner;

public class SquareRootOne {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int [] array1=new int[n];
		int [] array2=new int[n];
		for(int i=0;i<n;i++) {
			array1[i]=scanner.nextInt();
		}
		for(int arr:array1) {
			System.out.println(arr);
		}
		for(int i=0;i<n;i++) {
			array2[i]=(int)Math.sqrt(array1[i]);
		}
		for(int arr2:array2) {
			System.out.print(arr2+"\t");
		}
		scanner.close();
		
		
	}

}
