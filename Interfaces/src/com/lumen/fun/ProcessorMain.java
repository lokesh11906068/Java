package com.lumen.fun;

public class ProcessorMain {

	public static void main(String[] args) {
		Processor processor=new Processor();
		NewCalculator adder=new Adder();
		
		processor.ProcessData(adder, 10, 20);
		processor.ProcessData(new Adder(), 20, 30);
		//anonomous
		processor.ProcessData(new NewCalculator() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("Sum:"+(x*y));
			}
		} , 10, 200);
		//lambda
		
		processor.ProcessData((int x, int y)->{
			System.out.println("Lamda Sum:"+(x-y));
		},100, 20);
		
}

}
