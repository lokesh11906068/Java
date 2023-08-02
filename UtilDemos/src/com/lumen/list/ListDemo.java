package com.lumen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		System.out.println(list.size());
		list.add("Lokesh");
		list.add("100");
		list.add("Vyshu");
		list.add("mahesh");
		System.out.println(list);
		System.out.println(list.size());
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		list.add(1,"chandrakala");
		System.out.println(list);
//		list.set(2, "rakesh");

			Iterator<String> iterator=list.iterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.println(name);
			}
			System.out.println(list.get(3).toLowerCase());
			Collections.sort(list);
			System.out.print(list);		
			
			ListIterator<String> listIterator=list.listIterator(list.size());
			while(listIterator.hasPrevious()) {
				String name=listIterator.previous();
				System.out.println(name);
			}
	}

}
