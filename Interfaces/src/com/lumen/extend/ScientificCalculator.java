package com.lumen.extend;

public class ScientificCalculator extends BasicCalculator implements Scientific {

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println(x*x);
		
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println(x*x*x);
		
	}
	
}
