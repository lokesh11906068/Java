package com.lumen.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {
	public static void main(String[] args) {
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("demo.txt");
			String value=bufferedReader.readLine();
//			System.out.println(value);
			fileWriter.write(value);
			do {
//				System.out.println(value);
				fileWriter.write(value);
				value=bufferedReader.readLine();

			}
			while(!value.equals("stop")) ;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
//				if(fileWriter!=null)
				fileWriter.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
