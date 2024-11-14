package com.yash.demoapp4.exceptions;

public class TrainingIdNotFoundException extends Exception {

	public TrainingIdNotFoundException(String msg)
	{
		super(msg);
		System.out.println("No id found");
	}
	
}
