package com.xworkz.abstractclass;

public abstract class Computer {
	
	private int price;
	private String brand;
	private int storage;
	
	public abstract void consumeElectricity();
	
	public Computer(int price, String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	
	public Computer(String brand,int storage)
	{
		this.brand=brand;
		this.storage=storage;
	}

}
