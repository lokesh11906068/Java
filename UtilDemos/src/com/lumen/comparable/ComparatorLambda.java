package com.lumen.comparable;

import java.util.*;

public class ComparatorLambda {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle("audi","fortuner",223.3);
		Vehicle vehicle1=new Vehicle("toyota","toyo",231.3);
		Vehicle vehicle2=new Vehicle("benz","ben",213.3);
		Vehicle vehicle3=new Vehicle("bmw","bm",123.3);
		List<Vehicle>  vehicleList=Arrays.asList(vehicle,vehicle1,vehicle2,vehicle3);
		
		for(Object list:vehicleList) {
			System.out.println(list);
		}
		
//		Comparator<Vehicle> comparator=new BrandSort();
//		Collections.sort(vehicleList,(o1,o2)->{
//			return o1.getBrand().compareTo(o2.getBrand());
//		});
//		System.out.println("\n");
//		Collections.sort(vehicleList,(o1,o2)->{
//			return o1.getModel().compareTo(o2.getModel());
//		});
		Collections.sort(vehicleList,(o1,o2)->{
			return ((Double) o1.getPrice()).compareTo((Double)(o2.getPrice()));
		});
		for(Object list:vehicleList) {
			System.out.println(list);
		}
//		Comparator<Vehicle> comparator1=new ModelSort();
//		Collections.sort(vehicleList,comparator1);
//		System.out.println("\n");
//		for(Object list:vehicleList) {
//			System.out.println(list);
//		}
//		Comparator<Vehicle> comparator2=new PriceSort();
//		Collections.sort(vehicleList,comparator2);
//		System.out.println("\n");
//		for(Object list:vehicleList) {
//			System.out.println(list);
//		}
	}

}
