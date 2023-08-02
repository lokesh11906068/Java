package com.lumen.fun;

public interface Shape {
	void calculateArea(double x,double y);
}	
class Rectangle implements Shape{

	@Override
	public void calculateArea(double x, double y) {
		System.out.println("Rectangle:"+(x*y));
	}
	
}
class Triangle implements Shape{

	@Override
	public void calculateArea(double x, double y) {
		System.out.println("Triangle:"+(0.5*x*y));
	}
	
}