package com.lumen.methodreferences;

class Course {
	String courseName;
	void show() {
		System.out.println("Showing Courses:");
	}
}
interface IcourseDetails{
	Course getCourse();
}

public class RefConstDemo {
	public static void main(String[] args) {
		
	
	//Using Lambda to implement this returns a course object
	IcourseDetails icourseDetails=()->new Course();
	Course course=icourseDetails.getCourse();
	course.show();
	
	//Using Constrcutor Ref
	IcourseDetails icourseDetails2=Course::new;
	course=icourseDetails.getCourse();
	course.show();
}
}