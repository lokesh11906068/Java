package com.lumen.methodreferences;

interface AreaCalculator{
	void calculatearea(double x,double y);
}

public class MethRefDemo {

	public static void main(String[] args) {
		//using Lambda
		AreaCalculator areaCalculator=(x,y)->{
			System.out.println(x*y);
		};
			areaCalculator.calculatearea(20, 3);
			
			//using non-static method
			Shape shape=new Shape();
			AreaCalculator areaCalculator1=shape::rectangleArea;
			areaCalculator1.calculatearea(20, 30);
			
		
			areaCalculator1=shape::triangleArea;
			areaCalculator1.calculatearea(20, 30);
			
			Details details=new Details();
			INameChecker iNameChecker=details::showName;
			
			System.out.println(iNameChecker.checkName("lokesh"));
			
			
	}

}
class Shape {
	public void rectangleArea(double x,double y) {
		System.out.println(x*y);
	}
	public static void triangleArea(double x,double y) {
		System.out.println("Triangle:"+(0.5*x*y));
	}
}
