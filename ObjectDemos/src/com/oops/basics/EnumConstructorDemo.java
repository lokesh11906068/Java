package com.oops.basics;

public class EnumConstructorDemo {
	enum VehicleDetails{
		HONDA("HONDA",90000),
		AUDI("AUDI",99000),
		MAHINDRA("MAHINDRA",9600),
		BMW("BMW",75868);
	
	private String model;
	private double price;
	VehicleDetails( String model,double price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	}
	public static void main(String[] args) {
		VehicleDetails vehicleDetails=VehicleDetails.AUDI;
		System.out.println("Model:"+vehicleDetails.getModel());
		System.out.println("Model:"+vehicleDetails.getPrice());
		
		String model=vehicleDetails.HONDA.model;
		double price=vehicleDetails.HONDA.getPrice();
		System.out.println(model+" "+price);
		

	}

}
