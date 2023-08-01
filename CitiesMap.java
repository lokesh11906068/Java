package com.lumen.collections;
import java.security.KeyStore.Entry;
import java.util.*;
public class CitiesMap {

	public static void main(String[] args) {
		Map<String,List<String>> map=new HashMap<>();
		map.put("Karnataka", Arrays.asList("Banglore","Mysore","Hasan"));
		map.put("Andhra Pradesh", Arrays.asList("Kadiri","Vijayawada","Ananthapur","Tirupati"));
		map.put("Telangana", Arrays.asList("Hydrabad","Karimnagar","Warrangal"));
		map.put("Tamilnadu", Arrays.asList("Chennai","Salem","Rameswaram"));
		System.out.println("\n");

		System.out.println(map);
		System.out.println("\n");

		for (java.util.Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
//			
		}
		System.out.println("\n");
		Set<String> keys=map.keySet();
		for (String key : keys) {
			System.out.println(key+":"+map.get(key));
		}
}

}
