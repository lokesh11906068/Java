package com.lumen.io;

import java.io.FileReader;
import java.io.FileWriter;

public class TryWithResources {
	public static void main(String[] args) {
		try(
			FileReader fileReader=new FileReader("demo.txt");
				FileWriter fileWriter=new FileWriter("trail.txt");
				)
		{
			int num=fileReader.read();
			fileWriter.write((char)num);
			do {
				num=fileReader.read();
				fileWriter.write(num);
			}while(num!=-1);	
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
