package com.xworkz.objectmethods.equalto;

public class Stand {
	public String brand;
	public int price;
	public int height;
	public int weight;
	public String color;
	
	public Stand()
	{
		System.out.println("running no param const in Stand");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in stand class" +this);
		System.out.println("running equals in stand class" +obj);
		if(obj!=null && obj instanceof Stand )
		{
			Stand other=(Stand)obj;
			if(this.brand.equals(other.brand)&& this.price==other.price && this.height==other.height)
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " stand-brand: "+this.brand+ ", price:" +this.price+ ", height:" +this.height+ ",weight :" +this.weight+ ", color:" +this.color;
	}

}

	
	

	



	
	


