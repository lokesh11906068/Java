package com.lumen.objbasics;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.name="usha";
		student.department="CSE";
		student.printDetails();
		int[] marks= {56,64,45};
		String score=student.getGrades(marks);
		System.out.println(score);
	}

}