package com.lumen.objbasics;

public class Student {
	String name;
	String department;
	void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
	}
	String getGrades(int...marks) {
		int sum=0;
		for(int mark:marks)
			sum+=mark;
		double average;
		average=sum/(marks.length);
		char grade=' ';
		if(average>90 && average<=100)
			grade='A';
		else if(average>80 && average<=90)
			grade='B';
		else if(average>70 && average<=80)
			grade='C';
		else if(average>60 && average<=70)
			grade='D';
		else if(average>50 && average<=60)
			grade='E';
		else
			grade='F';
		return("Total marks: "+sum+"\nAverage: "+average+"\nGrade: "+grade);
		
	}

}
