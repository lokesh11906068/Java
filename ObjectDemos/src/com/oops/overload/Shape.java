package com.oops.overload;

public class Shape {

	void calculteArea(int length) {
		System.out.println("Sqrt:"+length*length);
	}
	void calculteArea(int length,int breadth) {
		System.out.println("rect:"+length*breadth);
	}
	void calculteArea(double radius) {
		System.out.println("Area Of Circle:"+Math.PI*radius*radius);
	}
	void calculteArea(double base,int height) {
	System.out.println(0.5*base*height);
	}
}
