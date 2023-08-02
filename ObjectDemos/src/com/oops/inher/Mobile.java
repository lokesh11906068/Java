package com.oops.inher;

public class Mobile extends Electronics {

	String cameratype;
	public Mobile(String model, String brand, Double price, String cameratype) {
		super(model, brand, price);
		this.cameratype = cameratype;
	}
	void showCameraType() {
		System.out.println(cameratype);
	}
}
