package com.lumen.abss;

public class Bike extends Vehicle {

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	void getMaileage() {
		// TODO Auto-generated method stub
		System.out.println("get Mailage");
	}
	

	@Override
	void showType() {
		// TODO Auto-generated method stub
		System.out.println("suv");
	}
	void engineType() {
		System.out.println("Engine Type");
	}

}
