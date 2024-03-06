package com.xworkz.constructor;

public abstract class Metro {
	
	abstract boolean build();
	
	public  String color;
	public String material;
	
	public Metro(String color,String material)
	{
		this.color=color;
		this.material=material;
	}
	
	

}
