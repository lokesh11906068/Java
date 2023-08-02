package com.lumen.interfaces;

public  class Manager extends Employee implements IEntertainment{

	public Manager(String name, int id, double salary,double bonus) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void VehicleIns() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Insurance");
	}

	@Override
	public void HealthIns() {
		// TODO Auto-generated method stub
		System.out.println("Health Insurance");
	}

	@Override
	String[] showCources() {
		// TODO Auto-generated method stub
		String[] show= {"sql","Ui","java"};
		return show;
	}

	@Override
	public void showTrips() {
		// TODO Auto-generated method stub
		System.out.println("Goa");
	}
	 void calBonus() {
		 System.out.println(salary);
	 }
}
