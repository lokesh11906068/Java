package com.lumen.abss;

public class Car extends Vehicle {
	String []showAccessories;
	public Car(String model, String brand, double price,String[] acc) {
		super(model, brand, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getMaileage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void showType() {
		// TODO Auto-generated method stub
		
	}
	void showAccessories() {
		for(String ass:showAccessories)
		{
			System.out.println(ass);
		}
	}
	

}
