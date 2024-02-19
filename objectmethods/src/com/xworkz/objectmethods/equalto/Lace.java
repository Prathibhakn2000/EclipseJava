package com.xworkz.objectmethods.equalto;

public class Lace {
	
	public String color;
	public int length;
	public int price ;
	public String material;
	public int meter;
	public String type;
	
	public Lace()
	{
		System.out.println("running no param const in Lace");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in lace class" +this);
		System.out.println("running equals in lace class" +obj);
		if(obj!=null && obj instanceof Lace )
		{
			Lace other=(Lace)obj;
			if(this.color.equals(other.color)&& this.length==other.length && this.price==other.price)
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Lace-color: "+this.color+ ", length:" +this.length+ ", price:" +this.price+ ", material:" +this.material+ ", meter:" +this.meter+ ", type:" +this.type;
	}
	

	
	

}
