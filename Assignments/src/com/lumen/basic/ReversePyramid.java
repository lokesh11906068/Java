package com.lumen.basic;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char key='*';
		int lines = 5;
		for(int i=lines;i>0;i--) {
			for(int j=i;j>0;j--)
			System.out.print(key);
			System.out.println();
		}
	}

}
