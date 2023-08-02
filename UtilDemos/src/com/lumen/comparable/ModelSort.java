package com.lumen.comparable;

import java.util.Comparator;

public class ModelSort  implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.getModel().compareTo(o2.getModel());
	}

}
