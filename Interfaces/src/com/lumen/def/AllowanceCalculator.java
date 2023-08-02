package com.lumen.def;

public interface AllowanceCalculator  {
void calculate(double amount);
default void policyType() {
	System.out.println("Have Great");
}
}
