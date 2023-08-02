package com.oops.overload;

public class Overloadedmain {

	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.calculteArea(10);
		shape.calculteArea(2.0);
		shape.calculteArea(2, 3);
		shape.calculteArea(12.9,2);
	}

}
