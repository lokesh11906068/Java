package com.lumen.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 28;
		int check=0;
		for(int i=1;i<number;i++) {
			if(number%i==0)check+=i;
			
		}
		System.out.println(check);
		if(number==check)System.out.println("enterd number is an Perfect Number");
		else System.out.println("enterd number is not an perfect number");
	}

}
