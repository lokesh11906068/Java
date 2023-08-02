package com.oops.basics;

public class EnumDemo {

	enum Weekdays{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	public static void main(String[] args) {
			Weekdays weekdays=Weekdays.FRIDAY;
			//convert enum to string
			System.out.println(weekdays.name());
			//to get index(ordinal)from enum
			Weekdays[] weekaWeekdays=Weekdays.values();
			for (Weekdays weekdays2:weekaWeekdays) {
				System.out.println(weekdays2.name());
			}
			System.out.println("Cnvert String to enum constant");
			weekdays=Weekdays.valueOf("MONDAY");
			System.out.println(weekdays);
			System.out.println();
			}
}
