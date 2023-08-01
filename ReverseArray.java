package com.lumen.basic;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {10,-9,45,88,1,4,8,48,8,65,21,65};
		int[] reverse =new int[original.length];
		
		for(int i=0;i<original.length;i++) {
			reverse[original.length-i-1]=original[i];
		}
		
		System.out.println(Arrays.toString(reverse));
	}
}
