package com.oops.inher;

public class Laptop extends Electronics {
	String[] ports;
	


	public Laptop(String model, String brand, double price, String[] ports) {
		super(model, brand, price);
		this.ports = ports;
	}

	void showPorts() {
		for(String port:ports) {
			System.out.println(port);
		}
	}
}
