package com.xworkz.vegetables.like;

public class Bird {
	
	String type;
	String color;
	
	protected Bird()  //protected constructor -> it access both new and super()for same package classes but other package class only super()
	{
		System.out.println("running no param Bird const");
	}

}
