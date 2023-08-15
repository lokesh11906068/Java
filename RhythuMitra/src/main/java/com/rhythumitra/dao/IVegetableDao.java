package com.rhythumitra.dao;

import java.util.List;

import com.rhythumitra.client.Vegetable;

public interface IVegetableDao {
	void addVegetable(Vegetable vegetable);
	void updateVegetable(String name,int id);
	void deleteVegetable(int id);
	List<Vegetable> findAllVegetables();
	Vegetable findById(int id);
	List<Vegetable> findByName(String name);
	List<Vegetable> findByPrice(double price);
	List<Vegetable> findByOrigin(String origin);
}
