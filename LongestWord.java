package com.lumen.scan;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String[] array=string.split(" ");
		String longestWord=" ";
		for(String str:array) {
			if (str.length()>longestWord.length())
				longestWord=str;
		}
		System.out.println("Longest word: "+longestWord);
	}

}
