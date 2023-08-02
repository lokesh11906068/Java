package com.lumen.fun;

public class Processor {
	void ProcessData(NewCalculator calculator,int x,int y) {
		System.out.println("Processing");
		calculator.calculate(x, y);
		System.out.println("completed");
	}
}
