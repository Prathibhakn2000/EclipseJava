package com.xworkz.objectmethods.equalto;

public class Mug {
	
	public String material;
	public int volume;
	public String shape;
	public String color;
	public String quality;
	public int price;
	
	public Mug()
	{
		System.out.println("running no param const in Mug");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Mug class" +this);
		System.out.println("running equals in Mug class" +obj);
		if(obj!=null && obj instanceof Mug )
		{
			Mug other=(Mug)obj;
			if(this.material.equals(other.material)&& this.volume==other.volume && (this.shape.equals(other.shape)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Mug-material: "+this.material+ ", volume:" +this.volume+ ", Shape:" +this.shape+ ", color:" +this.color+ ", quality:" +this.quality+ ", price:" +this.price ;
	}

}

	
	



