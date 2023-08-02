package com.lumen.interfaces;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee manager=new Manager("lokesh", 1001, 12984.4, 75382) ;
		
		manager.showCources();
		IInsurance ins=manager;
		ins.HealthIns();
		ins.VehicleIns();
		IEntertainment enter=(IEntertainment) manager;
		enter.showTrips();
		Manager manage=(Manager) manager;
		manage.calBonus();
	
		Employee  dev=new Developer("rakesh", 12, 1213);
		((Developer) dev).showProjects();
		dev.showCources();
		
	}

}
