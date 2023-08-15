package com.rhythumitra.model;

import java.util.stream.Collectors;

import com.rhythumitra.client.Vegetable;
import com.rhythumitra.dao.IVegetableDao;
import com.rhythumitra.service.IVegetableService;
import com.rhythumitra.service.VegetableServiceImpl;
import com.rhythumitra.util.DBConnection;

public class VegetableMain {

	public static void main(String[] args) {
		Vegetable vegetable=new Vegetable();
//		DBConnection.opeConnection();
		IVegetableService iVegetableService=new VegetableServiceImpl();
//		vegetable=new Vegetable("Beans",44.34,"Rayalaseema",33);
//		iVegetableService.addVegetable(vegetable);
//		iVegetableService.updateVegetable("Onion", 1);
//		iVegetableService.deleteVegetable(2);
		
		
		System.out.println(iVegetableService.getById(1));
		System.out.println("\n");
		iVegetableService.getAllVegetables().stream().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("\n");
		iVegetableService.getByName("potato").stream().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("\n");
		iVegetableService.getByName("potato").stream().collect(Collectors.toList()).forEach(System.out::println);

		


		
	}

}
