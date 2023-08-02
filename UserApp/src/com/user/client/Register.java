package com.user.client;

import java.util.Scanner;

import com.user.service.ValidateServiceImpl;

public class Register {

	public static void main(String[] args) {
		ValidateServiceImpl ivalidationservice=new ValidateServiceImpl();
//		Scanner scanner=new Scanner(System.in);
	
		try {
		System.out.println(ivalidationservice.validateUserName("kkl"));
		System.out.println(ivalidationservice.validatePassword("lokesh"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
