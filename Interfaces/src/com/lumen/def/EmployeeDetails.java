package com.lumen.def;

public class EmployeeDetails implements BonusCalculator ,AllowanceCalculator{

	@Override
	public void calculate(int amount) {
		System.out.println("Amount:"+(amount*5));
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		BonusCalculator.super.greet();
		System.out.println("have");
	}

	

	@Override
	public void calculate(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount*10);
	}

	@Override
	public void policyType() {
		// TODO Auto-generated method stub
		BonusCalculator.super.policyType();
		AllowanceCalculator.super.policyType();
	}
	
	

}
