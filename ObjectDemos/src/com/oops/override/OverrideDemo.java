package com.oops.override;

public class OverrideDemo {

	public static void main(String[] args) {
		Shaper shaper=new Triangle();
		shaper.area(10,50);
		Shaper rect=new Rectangle();
		rect.area(10, 20);
		shaper.greet();
		
	}

}
