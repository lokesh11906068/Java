package com.oops.inher;

public class InEmployee {
	String name;
	int id;
	public InEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InEmployee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void print() {
		
		System.out.println(name);
		System.out.println(id);
	}
}
