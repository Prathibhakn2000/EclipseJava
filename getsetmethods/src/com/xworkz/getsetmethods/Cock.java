package com.xworkz.getsetmethods;

public class Cock {
	
	private String material;
	private String color;
	public int price;
	public int weight;
	String madeIn;
	
	public Cock()
	{
		System.out.println("running no param const in Cock");
	}
	
	@Override
	public String toString() {
	
	return  " Cock-Material:"+this.material+ ", weight:"+this.weight+  ", price:"+this.price+ ", Color:"+this.color+ ", Madein:"+this.madeIn;
	}
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("box information in class" +this);
		//System.out.println("box information in class" +obj);
		if(obj!=null && obj instanceof Cock)
		{
			Cock cock=(Cock)obj;
			if(this.material.equals(cock.material) && this.weight==cock.weight && this.color.equals(cock.color)&& this.price==cock.price && (this.madeIn.equals(cock.madeIn))) 
					{
				      return true;
					}
	 
		}
	
		return false ;
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	public void setMaterial(String material)
	{
		this.material=material;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getMadeIn()
	{
		return madeIn;
	}
	
	public void setMadeIn(String madeIn)
	{
		this.madeIn=madeIn;
	}
	
	

}
