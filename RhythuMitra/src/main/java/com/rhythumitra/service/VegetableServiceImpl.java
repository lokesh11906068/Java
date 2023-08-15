package com.rhythumitra.service;

import java.util.List;


import com.rhythumitra.client.Vegetable;
import com.rhythumitra.dao.IVegetableDao;
import com.rhythumitra.dao.VegetableDaoImpl;
import com.rhythumitra.exceptions.VegetableNotFoundException;

public class VegetableServiceImpl implements IVegetableService {

	IVegetableDao iVegetableDao=new VegetableDaoImpl();
	@Override
	public void addVegetable(Vegetable vegetable) {
		iVegetableDao.addVegetable(vegetable);
	}

	@Override
	public void updateVegetable(String name, int id) {
		iVegetableDao.updateVegetable(name, id);
	}

	@Override
	public void deleteVegetable(int id) {
		iVegetableDao.deleteVegetable( id);
		
	}

	@Override
	public List<Vegetable> getAllVegetables() {
		List<Vegetable> vegetables=iVegetableDao.findAllVegetables();
		
		return vegetables;
	}

	@Override
	public Vegetable getById(int id) {
		Vegetable vegetable=new  Vegetable();
		vegetable=iVegetableDao.findById(id);
		return vegetable;
	}

	@Override
	public List<Vegetable> getByName(String name) {
		List<Vegetable> vegetables=iVegetableDao.findByName(name);
		
		return vegetables;
	}

	@Override
	public List<Vegetable> getByPrice(double price) {
List<Vegetable> vegetables=iVegetableDao.findByPrice(price);
		
		return vegetables;
	}

	@Override
	public List<Vegetable> getByOrigin(String origin) {
List<Vegetable> vegetables=iVegetableDao.findByOrigin(origin);
		
		return vegetables;
	}

}
