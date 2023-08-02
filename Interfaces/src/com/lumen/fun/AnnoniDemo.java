package com.lumen.fun;

public class AnnoniDemo {
	public static void main(String[] args) {
		Greeter greeter=new GreeterImpl();
		greeter.greetUser("Lokesh");
		
		
		//annonomous class--implementation
		Greeter greeter2=new Greeter() {

			@Override
			public void greetUser(String userName) {
				// TODO Auto-generated method stub
				System.out.println("Welcome:"+userName);
			}
			
			
		};
		greeter2.greetUser("rakesh");
		Greeter greeter3=new Greeter() {

			@Override
			public void greetUser(String userName) {
				// TODO Auto-generated method stub
				System.out.println("Welcome beta:"+userName);
			}
		};
		greeter3.greetUser("lok");
	}

}
