package com.yash.trainingsys.utilities;

import java.util.function.Supplier;

import com.yash.trainingsys.model.Training;



public class CustomSupplier implements Supplier<Training> {

	@Override
	public Training get() {
		System.out.println(" No Result Found");
		return null;
	}

}
