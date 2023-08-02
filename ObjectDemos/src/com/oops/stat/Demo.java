package com.oops.stat;
import static com.oops.stat.Trail.*;//importing static class form package
public class Demo {
	
	static {
		System.out.println("Static Demo");
	}
public static void main(String[] args) {
	System.out.println("Main Demo"); 
	getMessage();
	System.out.println("Value:"+(x+y));
}
}
