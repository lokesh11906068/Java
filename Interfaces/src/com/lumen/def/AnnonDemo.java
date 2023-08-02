package com.lumen.def;

public class AnnonDemo {

	public static void main(String[] args) {
		BonusCalculator bonusCalculator=new BonusCalculator() {
			
			@Override
			public void calculate(int amount) {
				// TODO Auto-generated method stub
				System.out.println(amount+122);
				
			}
		};
		bonusCalculator.calculate(100);
		AllowanceCalculator allowanceCalculator=new AllowanceCalculator() {
			
			@Override
			public void calculate(double amount) {
				// TODO Auto-generated method stub
				System.out.println(amount*10);
			}
		};
		allowanceCalculator.calculate(20);
	}

}
