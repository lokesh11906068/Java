package com.lumen.interfaces;

public abstract class Employee implements IInsurance {
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void printDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	abstract String[] showCources();

}
