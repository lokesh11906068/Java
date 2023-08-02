package com.lumen.scan;

import java.util.Scanner;

public class ThreeGreater {
	public static void main(String[] args) {
		System.out.print("Enter three numbers:");
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		System.out.println((number1>number2&&number1>number3)?"1st number is greater":((number2>number3)?"2nd number is greater":"3rd number is greater"));
	sc.close();
	}
}
