package com.lumen.basic;

public class SecondLargestElement {

	public static void main(String[] args) {
		int array[]= {10,4,6,2,7};
		int largest1=array.length-1;
		int largest2=array.length-1;
		for(int large:array) {
			if(large>largest1) {
				largest2=largest1;
				largest1=large;
			}
			else if(large>largest2) {
				largest2=large;
			}
		}
		System.out.println(largest1);
		System.out.println(largest2);
	}

}
