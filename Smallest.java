package com.lumen.scan;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		if(a<c && a<b) {
			System.out.println("a is smaller");
		}
		else if(b<c) {
			System.out.println("b is smaller");
		}
		else {
			System.out.println("c is smaller");
		}
		scanner.close();
		}

}
