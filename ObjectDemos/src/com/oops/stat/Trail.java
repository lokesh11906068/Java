package com.oops.stat;

public class Trail {
	static int x;
	static int y=20;
	static {
		System.out.println("In static Block");
		x=10;
	}
	static void getMessage() {
		System.out.println("In method");
	}



public static void main(String[] args) {
	System.out.println("In Main");
	getMessage();
	System.out.println(x+y);
	
}	}
