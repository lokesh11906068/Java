package com.oops.override;

public class Triangle extends Shaper{

	@Override
	void area(int x, int y) {
		System.out.println("Triangle:"+0.5*x*y);
	}

	@Override
	void greet() {
		// TODO Auto-generated method stub
		super.greet();
	}
	

}
