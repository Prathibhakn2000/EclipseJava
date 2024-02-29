package com.xworkz.constructor;

public class Book2 {
	String name;
	int price;
	String brand;
	public Book2() {
		
	}
	public Book2(String name, int price,String brand)
	{
		this(price,brand);
		this.name=name;
	}
	public Book2(int price, String brand)
	{
		this(price);
		this.brand=brand;
	}
	public Book2(int price)
	{
		this.price=price;
	}

}
