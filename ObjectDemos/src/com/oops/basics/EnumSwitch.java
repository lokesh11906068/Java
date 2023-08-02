package com.oops.basics;

import java.util.Scanner;

enum Seasons{
	SUMMER,WINTER,RAINY,AUTUMN,MANSOON
}
public class EnumSwitch {
	 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Season:");
		String value=scanner.next().toUpperCase();
		Seasons seasons=Seasons.valueOf(value);
		switch(value){
		case "SUMMER":{
			System.out.println("Soo Hot ,Eat Ice Creams");
			break;
		}
		case "RAINY":{
			System.out.println("Dring Coffee yar");
			break;
		}
		case "WINTER":{
			System.out.println("Always try to sleep");
			break;
		}
		case "AUTUMN":{
			System.out.println("Enjoy pandagooo");
			break;
		}
		default:{
			System.out.println("Enter Correct Seasonjagk");
		}
	}
	}

}
