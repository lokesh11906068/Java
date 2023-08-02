package com.lumen.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NeviSet {
	public static void main(String[] args) {
		NavigableSet<String> navigableSet=new TreeSet<String>(Arrays.asList("java","sql","c++","python"));
		System.out.println(navigableSet);
		System.out.println(navigableSet.descendingSet());
		System.out.println(navigableSet.headSet("python"));
		System.out.println(navigableSet.headSet("sql", true));
		System.out.println(navigableSet.tailSet("c++"));
		System.out.println();
		
		System.out.println(navigableSet.first());
		System.out.println(navigableSet.last());
		System.out.println(navigableSet.floor("sql"));
		System.out.println(navigableSet.floor("sq"));
		System.out.println(navigableSet.ceiling("java"));
		System.out.println(navigableSet.ceiling("on"));
		
	}
}
