package com.lumen.basic;

public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char key='*';
		int lines = 5;
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=i;j++)
			System.out.print(key);
			System.out.println();
		}
	}
}
