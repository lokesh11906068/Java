package com.lumen.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadWrite {
	public static void main(String[] args) {
		FileReader fileReader=null;
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("trail.txt");
			fileReader =new FileReader("demo.txt");
			int num=fileReader.read();
			fileWriter.write((char)num);
			do {
				num=fileReader.read();
				fileWriter.write(num);
			}while(num!=-1);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
