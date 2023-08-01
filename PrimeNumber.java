package com.lumen.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=2;
		boolean isPrime=true;
		if(number<1) {
			isPrime=false;
		}
		else {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}
		if(isPrime)
		System.out.println(number+" is prime");
		else
			System.out.println(number+" is Not Prime");
		
	}

}
