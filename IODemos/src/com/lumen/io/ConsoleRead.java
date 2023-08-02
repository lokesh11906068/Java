package com.lumen.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {
	public static void main(String[] args)  {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		char value;
		try {
		 value=(char) bufferedReader.read();
		System.out.print(value);
		while(value!='q') {
			value=(char)bufferedReader.read();
			System.out.print(value);
		}
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
}
