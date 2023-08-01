package com.lumen.basic;

public class Armstrong {

	public static void main(String[] args) {
		int number=371;
		int number1=number;
		long result=0;
//		long total=0;
		while(number!=0) {
			result+=(int)Math.pow(number%10,3);
			number=number/10;
			
		}
		if(number1==result) {
		System.out.println("Armatrong Number"+result);
		}
		else {
			System.out.println("Not Armstrong Number"+result);
		}
	}

}
