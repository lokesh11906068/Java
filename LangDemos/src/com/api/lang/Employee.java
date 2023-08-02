package com.api.lang;

public class Employee {
	private String employeName;
	private Integer employeeId;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeName, Integer employeeId, double salary) {
		super();
		this.employeName = employeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeName=" + employeName + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
	
	
}
