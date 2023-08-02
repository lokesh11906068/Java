package com.lumen.extend;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculater calculator=new  BasicCalculator();
//		calculator.add(10,3);
//		calculator.product(2, 3);
//		
		Scientific scientific=new ScientificCalculator();
		scientific.cube(10);
		scientific.square(20);
		scientific.add(2, 3);
		scientific.product(3,6);
		scientific.difference(13, 2);
}

}
