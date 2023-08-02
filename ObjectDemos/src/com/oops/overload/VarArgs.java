package com.oops.overload;

public class VarArgs {
	int calculateSum(String name,int... marks) {
		System.out.println("Welcome "+name);
		int sum=0;
		for(int mark:marks) {
			sum+=mark;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		VarArgs varargs=new VarArgs();
		varargs.calculateSum("lokesh");
		int review=varargs.calculateSum("Venky", 10,20);
		System.out.println(varargs.calculateSum("rakesh", 100,90,80));
		System.out.println(review);
	}
}
