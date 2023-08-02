package com.oops.overload;

public class Vehicle {
	String model;
	String brand;
	double price;
	public Vehicle() {
		super();
	}
	public Vehicle(String model, String brand, double price) {
		this(model,price);
		this.price = price;
		System.out.println("There params"+model+brand+price);
	}
	public Vehicle(String model, double price) {
		this(model);
		this.price = price;
		System.out.println("Two Params"+model+price);
	}
	public Vehicle(String model) {
		this();
		this.model = model;
		System.out.println("One Param"+model);
	}
	void print() {
		if(model!=null)
		System.out.println(model);
		if(brand!=null)
		System.out.println(brand);
		if(price>0)
		System.out.println(price);
		
	}
	
}
