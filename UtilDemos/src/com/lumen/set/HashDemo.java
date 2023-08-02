package com.lumen.set;
import java.util.*;

public class HashDemo {
	public static void main(String[] args) {
		Set<String> hashSet=new HashSet<>();
		Set<String> linkedHashSet=new LinkedHashSet<>();
		Set<String> treeSet=new TreeSet<>();

		
		hashSet.add("lokesh");
		hashSet.add("rakes");
		hashSet.add("chandu");
		hashSet.add(null);
		hashSet.add("lokesh");
		System.out.println(hashSet);
		
		for (String string : hashSet) {
			System.out.println(string);
			
		}
		System.out.println("\n");
		linkedHashSet.add("lokesh");
		linkedHashSet.add("rakes");
		linkedHashSet.add("chandu");
		linkedHashSet.add(null);
		linkedHashSet.add("lokesh");
		for (String string : linkedHashSet) {
			System.out.println(string);
			
		}
		System.out.println("\n");
		treeSet.add("lokesh");
		treeSet.add("rakes");
		treeSet.add("chandu");
//		treeSet.add(null);
		treeSet.add("lokesh");
		for (String string : treeSet) {
			System.out.println(string);
			
		}
	}
}
