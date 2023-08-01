package com.lumen.basic;

public class SmallestElement {

	public static void main(String[] args) {
		int array[]= {10,2,30,40,50,5};
		int smallest=array[0];
		for(int small:array) {
			if(small<smallest) {
				smallest=small;
			}
		}
		System.out.println(smallest);
	}

}
