package com.xworkz.getsetmethods;

public class Box {
	
	String brand;
	String color;
	String shape;
	int price;
	String material;
	
	public Box()
	{
		System.out.println("running no param const in Box");
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("box information in class" +this);
		//System.out.println("box information in class" +obj);
		if(obj!=null && obj instanceof Box)
		{
			Box box=(Box)obj;
			if(this.brand.equals(box.brand) && this.color.equals(box.color) && this.shape.equals(box.shape)&& this.price==box.price && (this.material.equals(box.material))) 
					{
				      return true;
					}
	 
		}
	
		return false ;
	}
	
	@Override
	public String toString() {
	
	return  " Box-Brand:"+this.brand+ ", Color:"+this.color+ ", Shape:"+this.shape+ ", Price:"+this.price+ ", Material:"+this.material;
	}
	
	public String getBrand() //read access
	{
		return brand;
	}
	public String getColor()
	{
		return color;
	}
	public String getShape()
	{
		return shape;
	}
	public int getPrice()
	{
		return price;
	}
	public String getMaterial()
	{
		return material;
	}
	
	public void setBrand(String brand)  // write access
	{
		 this.brand=brand;
	}
	public void setColor(String color)
	{
		 this.color=color;
	}
	public void setShape(String shape)
	{
		 this.shape=shape;
	}
	public void setPrice(int price)
	{
		 this.price=price;
	}
	public void setMaterial(String material)
	{
		 this.material=material;
	}

}
