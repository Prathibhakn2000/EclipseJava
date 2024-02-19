package com.xworkz.objectmethods.equalto;

public class Fan {
	
	public String brand;
	public int price;
	public String color;
	public int warrenty;
	public int wings;
	public int manifactringDate;
	
	public Fan()
	{
		System.out.println("running no param const in Fan");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Fan class" +this);
		System.out.println("running equals in Fan class" +obj);
		if(obj!=null && obj instanceof Fan )
		{
			Fan other=(Fan)obj;
			if(this.brand.equals(other.brand)&& this.price==other.price && (this.color.equals(other.color)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Fan-brand: "+this.brand+ ", price:" +this.price+ ", color:" +this.color+ ", warrenty:" +this.warrenty+ ", wings:" +this.wings+ ", manifactringDate:" +this.manifactringDate ;
	}

}

	
	
