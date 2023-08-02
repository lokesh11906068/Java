package com.lumen.basic;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int array[]= {10,4,6,2,7};
		int smallest1=array[0];
		int smallest2=array[0];
		for(int small:array) {
			if(small<smallest1) {
				smallest2=smallest1;
				smallest1=small;
			}
			else if(small<smallest2) {
				smallest2=small;
			}
		}
		System.out.println(smallest1);
		System.out.println(smallest2);
	}

}
