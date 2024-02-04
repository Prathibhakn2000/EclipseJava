package com.xworkz.vegetables.like;

public class Bag {
   
	String material;
	String color;
	
	private Bag()  //private const -> it access only same class not another class
	{
		System.out.println("running Bag no param const");
	}
	
	Bag bag=new Bag();
}
