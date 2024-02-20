package com.xworkz.getsetmethods;

public class Basket {
	
	public String material;
	String type;
	int price=250;
	public String color;
	private String madeIn;
	
	public Basket()
	{
		System.out.println("running no param const in Basket");
	}
	

	@Override
	public String toString() {
	
	return  " Basket-Material:"+this.material+ ", Type:"+this.type+ ", price:"+this.price+ ", Color:"+this.color+ ", Madein:"+this.madeIn;
	}
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("box information in class" +this);
		//System.out.println("box information in class" +obj);
		if(obj!=null && obj instanceof Basket)
		{
			Basket basket=(Basket)obj;
			if(this.material.equals(basket.material) && this.type.equals(basket.type) && this.color.equals(basket.color)&& this.price==basket.price && (this.madeIn.equals(basket.madeIn))) 
					{
				      return true;
					}
	 
		}
	
		return false ;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type=type;
		
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
		
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
