package com.lumen.interfaces;

public class Developer extends Employee implements IGamer,IEntertainment {

	public Developer(String name, int id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void VehicleIns() {
		// TODO Auto-generated method stub
		System.out.println("vehicle");
	}

	@Override
	public void HealthIns() {
		// TODO Auto-generated method stub
		System.out.println("Health");
	}

	@Override
	public void inDoor() {
		// TODO Auto-generated method stub
		System.out.println("Indoor");
	}

	@Override
	public void outDoor() {
		// TODO Auto-generated method stub
		System.out.println("outdoor");
	}

	@Override
	String[] showCources() {
		// TODO Auto-generated method stub
			String[] courses= {"sql","java"};
		return courses;
	}


	@Override
	public void showTrips() {
		// TODO Auto-generated method stub
		
	}
	void showProjects()
	{
		System.out.println("Java Projects");
	}
}
