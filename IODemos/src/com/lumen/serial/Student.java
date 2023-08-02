package com.lumen.serial;

import java.io.Serializable;

public class Student  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private String studentName;
	private String StudentId;
	private transient String department;//will not be saved
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String studentId, String department) {
		super();
		this.studentName = studentName;
		StudentId = studentId;
		this.department = department;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", StudentId=" + StudentId + ", department=" + department + "]";

	}
}
