package com.oops.inher;

public class InManager extends InEmployee {
	double salary;
	public InManager(String name,int id, double salary) {
		super(name, id);
		this.salary=salary;
		
	}
	void printBonus(double amount) {
		System.out.println(salary+amount);
	}
}
