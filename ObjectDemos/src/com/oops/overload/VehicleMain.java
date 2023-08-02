package com.oops.overload;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.print();
		vehicle=new Vehicle("2000v");
		vehicle.print();
		vehicle=new Vehicle("2100a",100000);
		vehicle.print();
		vehicle=new Vehicle("2010b","audi",7537);
		vehicle.print();
	}

}
