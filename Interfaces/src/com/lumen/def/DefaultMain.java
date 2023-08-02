package com.lumen.def;

public class DefaultMain {

	public static void main(String[] args) {
		BonusCalculator bonusCalculator=new EmployeeDetails();
		bonusCalculator.calculate(10);
		bonusCalculator.greet();
//		bonusCalculator.super.policyType();
		BonusCalculator.call();
	}

}
//Static methods cant be overriden it canbe done by interfaces only