package com.xworkz.getsetmethods;

public class Pot {
	
	public String material;
	String color;
	private int price;
	public int length;
	int weight;
	
	public Pot()
	{
		System.out.println("rinning no param const in Pot");
	}
	
	@Override
	public String toString() {
	
	return  " Pot-Material:"+this.material+ ", weight:"+this.weight+  ", price:"+this.price+ ", Color:"+this.color+ ", length:"+this.length;
	}
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("box information in class" +this);
		//System.out.println("box information in class" +obj);
		if(obj!=null && obj instanceof Pot)
		{
			Pot pot=(Pot)obj;
			if(this.material.equals(pot.material) && this.weight==pot.weight && this.color.equals(pot.color)&& this.price==pot.price && (this.length==pot.length)) 
					{
				      return true;
					}
	 
		}
	
		return false ;
	}
	
	public String getColor()
	{
		return color;
		
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public int getPrice()
	{
		return price;
		
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getWeight()
	{
		return weight;
		
	}
	
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	

}
