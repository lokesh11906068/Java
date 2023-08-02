package com.lumen.fun;

public class NewCalculatorMain {

	public static void main(String[] args) {
			NewCalculator newCalculator=(x,y)-> {
			System.out.println("x+y:"+(x+y));
			};
			 newCalculator=(x,y)-> {
				System.out.println("x*y:"+(x*y));
			};
		
			NewCalculator newCalculator2=(x,y)-> {
				System.out.println("x-y:"+(x-y));
			};
		
			newCalculator.calculate(10, 10);
			newCalculator.calculate(20, 10);
			newCalculator2.calculate(20, 10);
			
			Printer printer=()->{
				return "Welcome";
			
			};
			System.out.println(printer.print());
			printer=()->"Welcome back";
			System.out.println(printer.print());
			
	}

}
