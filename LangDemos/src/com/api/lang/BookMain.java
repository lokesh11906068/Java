package com.api.lang;

public class BookMain {
	public static void main(String[] args) {
		Book book1=new Book("java","lokesh",789146L);
		Book book2=new Book("java","rakesh",789146L);
		Book book3=new Book("kotlin","yash",7819146L);

		System.out.println("1 and 2"+book1.equals(book2));
		System.out.println("1 and 3"+book1.equals(book3));

//		System.out.println("1 and 1"+book1.equals(book2));
		System.out.println("One HashCode:"+book1.hashCode());
		System.out.println("Two HashCode:"+book2.hashCode());
		System.out.println("Three HashCode:"+book3.hashCode());

		
		int x=10;
		long  y=x;
		Long a=y;
		int b=(int) y;
		Object o=a;
		
		Integer i=(Integer) o;
		System.out.println(x);
		System.out.println(y);

		System.out.println(a);

		System.out.println(o);
		System.out.println(i);
//		System.out.println(x);

		
		

		
	}
}
