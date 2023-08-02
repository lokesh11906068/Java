package com.lumen.fun;

public interface NewCalculator {
	void calculate(int x,int y);
}
class Adder implements NewCalculator{

	@Override
	public void calculate(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Sum:"+(x+y));
	}
	
}