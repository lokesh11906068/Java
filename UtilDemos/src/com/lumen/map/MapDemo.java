package com.lumen.map;

import java.util.Map.Entry;
import java.util.*;

public class MapDemo {
public static void main(String[] args) {
//	Map<Integer,String> map=new HashMap<>();
//	Map<Integer,String> map=new LinkedHashMap<>();
	Map<Integer,String> map=new TreeMap<>();


	
	map.put(1, "lokesh");
	map.put(3, "rakesh");
//	map.put(null,"chandu");
	map.put(2, "Vyshu");
	System.out.println(map);
	System.out.println(map.getOrDefault(4, "chandra"));
	
	Set<Integer> keys=map.keySet();
	for (Integer key : keys) {
		System.out.println(key+":"+map.get(key));
	}
	
	Set<Entry<Integer,String>> entrySet=map.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	for (Entry<Integer, String> entry : map.entrySet()) {
		System.out.print(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}
