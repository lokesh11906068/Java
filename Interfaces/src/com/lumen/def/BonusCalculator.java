package com.lumen.def;

public interface BonusCalculator {
	void calculate(int amount);
	default void greet() {
		System.out.println("Have a good day");
	}
	default void policyType(){
		System.out.println("Policy");
	}
	static void call() {
		System.out.println("Calling for lunch");
	}
}
