package com.lumen.methodreferences;

public interface INameChecker {
	String checkName(String name);
}

class Details{
	String showName(String name) {
		if(name.equals("lokesh")) {
			return "hello"+name;
		}
		else {
			System.out.println("Wrong User Name");
		}
		return null;
	}
}
