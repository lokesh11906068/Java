package com.oops.basics;

public class Employee {
	String name;
	int id;
	double salary;
	public void getDetails() {
		System.out.println("Employee name:"+name+"\nEmployee Id:" + id+"\nEmployee Salary" +salary);

	}
	
//	public static void main(String[] args) {
//		Employee employee=new Employee();
//		System.out.println("Employee name:"+employee.name+"\nEmployee Id:" + employee.id+"\nEmployee Salary" +employee.salary);
//		employee.name="lokesh";
//		employee.id=100;
//		employee.salary=286981.3;
//		System.out.println("Employee name:"+employee.name+"\nEmployee Id:" + employee.id+"\nEmployee Salary" +employee.salary);
//	
//		
//		Employee employee1=new Employee();
//		System.out.println("Employee name:"+employee.name+"\nEmployee Id:" + employee.id+"\nEmployee Salary" +employee.salary);
//		employee1.name="rakesh";
//		employee1.id=200;
//		employee1.salary=6981.3;
//		System.out.println("Employee1 name:"+employee1.name+"\nEmployee1 Id:" + employee1.id+"\nEmployee1 Salary" +employee1.salary);
//	
//		 
//		Employee employee2=employee;
//		System.out.println("Employee1 name:"+employee2.name+"\nEmployee1 Id:" + employee2.id+"\nEmployee1 Salary" +employee2.salary);
//
//		employee=null;
//		System.out.println("Employee name:"+employee.name+"\nEmployee Id:" + employee.id+"\nEmployee Salary" +employee.salary);
//		 employee=employee1;
//			System.out.println("Employee name:"+employee.name+"\nEmployee Id:" + employee.id+"\nEmployee Salary" +employee.salary);
//
//	}
}
