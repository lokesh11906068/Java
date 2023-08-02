package com.lumen.fun;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checker checker=( userName, city)->{
			if(userName.equals("lokesh")&& city.equals("bang"))
			return true;
			return false;
			
			
		};
		System.out.println(checker.checkName("lokesh", "bang"));
	}

}
