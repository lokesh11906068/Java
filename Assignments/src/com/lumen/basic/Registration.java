package com.lumen.basic;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String usernames[]= {"lokesh","rakesh","chandu"};
		System.out.println("Enter the Name to Register:");
		String userinput=scanner.nextLine();
		int count=0;
		for (String username:usernames) {
			
		if(userinput.equals(username)) {
			 count=1;	
			
		}
		}
		if(count==1) {
			System.out.println("You are registered");
			
			
		}
		else {
			System.out.println("enter correct name");
		}
		
		
		
		scanner.close();
	}

}
