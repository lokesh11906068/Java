package com.lumen.basic;

public class GreatestElement {

	public static void main(String[] args) {
		int array[]= {10,30,400,26,56};
		int greater=array[0];
		
		for(int max:array) {
			if(max>greater) {
				greater=max;
			}
		}
		System.out.println(greater);
	}

}
