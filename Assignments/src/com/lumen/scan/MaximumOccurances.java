package com.lumen.scan;

import java.util.Scanner;

public class MaximumOccurances {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String word=scanner.next();
		int max=-1;
		char result=' ';
		int count[]=new int[256];
		for(int i=0;i<word.length();i++) {
			count[word.charAt(i)]++;
			System.out.println(count[word.charAt(i)]);
		}
		
		for(int i=0;i<word.length();i++) {
			char letter=word.charAt(i);
			if(max<count[letter]) {
				max =count[letter];
				result=letter;
				
			}
			
		}
		System.out.println("Maximum occurence letter "+result);
		scanner.close();
		
	}

}
