package com.xworkz.root.type;

public class Paint {
	
	public String color;
	public int price;
	public int rating;
	
	public Paint(String color,int price,int rating)
	{
		this.color=color;
		this.price=price;
		this.rating=rating;
	}
	
	public void selectColor()
	{
		System.out.println("running selectColor in paint"); 
		super.toString();
	}
	
	@Override
	public String toString() {
		System.out.println("running toString in paint");
		return "Color:" +this.color+", Price:" +this.price+", Rationg:" +this.rating;
	}

}
