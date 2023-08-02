package com.lumen.fun;

public class LambdaDemo {
	public static void main(String[] args) {
		Greeter greeter=userName->System.out.println("Welcome"+userName);
		greeter.greetUser("lOkesh");
		Greeter greeter1=(String userName)->{System.out.println("Welcome"+userName);};
		greeter1.greetUser("lok");
	}
}
