package com.lumen.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
public static void main(String[] args) {
	Student student=new Student();
	student.setStudentName("Lokesh");
	student.setStudentId("1100");
	student.setDepartment("cse");
	
	try(FileOutputStream fileOutputStream=new FileOutputStream("stud.ser");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);)
	{
		objectOutputStream.writeObject(student);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
