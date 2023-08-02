package com.lumen.scan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int number1=0;
		int num=number;
		while(num>0) {
			int temp=num%10;
			number1=number1*10+temp;
			num=num/10;	
		}
		if(number==number1)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
