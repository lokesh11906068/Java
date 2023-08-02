package com.lumen.abss;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] acc= {"cover","tool"};
		Vehicle vehicle=new Car("model", "brand", 1243.45, acc);
		vehicle.showType();
	}

}
