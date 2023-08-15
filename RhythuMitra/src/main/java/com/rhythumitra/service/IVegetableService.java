package com.rhythumitra.service;

import java.util.List;

import com.rhythumitra.client.Vegetable;

public interface IVegetableService {

	void addVegetable(Vegetable vegetable);
	void updateVegetable(String name,int id);
	void deleteVegetable(int id);
	List<Vegetable> getAllVegetables();
	Vegetable getById(int id);
	List<Vegetable> getByName(String name);
	List<Vegetable> getByPrice(double price);
	List<Vegetable> getByOrigin(String origin);
	
}
