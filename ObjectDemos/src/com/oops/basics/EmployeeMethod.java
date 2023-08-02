package com.oops.basics;

public class EmployeeMethod {

	String name;
	int id;
	double salary;
	
	public static void main(String[] args) {
		Employee employee=new Employee();
//		System.out.println("Employee name:"+employee.name+"\nEmployee Id:" + employee.id+"\nEmployee Salary" +employee.salary);
		employee.name="lokesh";
		employee.id=100;
		employee.salary=286981.3;
		System.out.println("Employee name:"+employee.name+"\nEmployee Id:" + employee.id+"\nEmployee Salary" +employee.salary);
	
		
		Employee employee1=new Employee();
		employee1.name="rakesh";
		employee1.id=200;
		employee1.salary=6981.3;
	 
		Employee employee2=employee;
		employee.getDetails();
		System.out.println(greet("chandrakala"));

	}

	private static String greet(String string) {
		return "Welcome"+string;
	}

}
