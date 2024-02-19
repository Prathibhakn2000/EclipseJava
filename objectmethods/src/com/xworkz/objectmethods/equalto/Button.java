package com.xworkz.objectmethods.equalto;

public class Button {
	
	public String brand;
	public int price;
	public String color;
	public String design;
	public String shape;
	
	public Button()
	{
		System.out.println("running no param const in button");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in button class" +this);
		System.out.println("running equals in button class" +obj);
		if(obj!=null && obj instanceof Button )
		{
			Button other=(Button)obj;
			if(this.brand.equals(other.brand)&& this.price==other.price && (this.color.equals(other.color)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Carrom-brand: "+this.brand+ ", price:" +this.price+ ", color:" +this.color+ ", design:" +this.design+ ", shape:" +this.shape;
	}
	

}
