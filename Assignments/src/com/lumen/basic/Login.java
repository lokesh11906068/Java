package com.lumen.basic;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String usernames[]= {"lokesh","rakesh","chandu"};
		System.out.println("Enter the Name to login:");
		String userinput=scanner.nextLine();
		int count=0;
		for (String username:usernames) {
			if(userinput.equals(username)) {
				System.out.println("Login Successful");
				return;	
			}
		}
		
			System.out.println("Invalid Username");

		scanner.close();
	}

}
