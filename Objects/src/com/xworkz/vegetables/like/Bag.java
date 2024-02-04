package com.xworkz.vegetables.like;

public class Bag {
   
	String material;
	String color;
	
	private Bag()  //private const -> it access only same class  not another class from same package
	{
		System.out.println("running Bag no param const");
	}
	
	Bag bag=new Bag();
}
