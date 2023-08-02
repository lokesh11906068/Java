package com.lumen.extend;

public class BasicCalculator implements Calculater {

	@Override
	public void add(int x, int y) {
		System.out.println(x+y);
		
		
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x*y);
	}

}
