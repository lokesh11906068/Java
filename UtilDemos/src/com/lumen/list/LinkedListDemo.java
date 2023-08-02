package com.lumen.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	System.out.println(list.size());
	list.add("Lokesh");
	list.add("100");
	list.add("Vyshu");
	list.add("mahesh");
	list.add("Chandu");
	
	System.out.println(list.peek());
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.remove());
	System.out.println(list.element());
//
//		Iterator<String> iterator=list.iterator();
//		while (iterator.hasNext()) {
//			String name = iterator.next();
//			System.out.println(name);
//		}
}
}
