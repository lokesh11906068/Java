package com.lumen.fun;

public class ShapeMain {

	public static void main(String[] args) {
		
		ShapeFactory shape=new ShapeFactory() ;
		Shape rectangle=new Rectangle();
		Shape triangle=new Triangle();
		shape.printArea(rectangle, 10, 20);
		
		shape.printArea(triangle, 20, 30);
	}

}
