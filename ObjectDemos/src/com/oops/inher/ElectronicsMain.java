package com.oops.inher;

public class ElectronicsMain {

	public static void main(String[] args) {
		String ports[]= {"hdmi","usb","lan","vga"};
		Laptop laptop=new Laptop("i5", "core", 100009.90, ports);
		laptop.showPorts();
		
		Mobile mobile=new Mobile("realme", "14px", 209993.78,"rear");
		mobile.showCameraType();
		
		Electronics electronics=new Electronics("a5s", "oppo", 12220.33);
		electronics.print();
	}

}
