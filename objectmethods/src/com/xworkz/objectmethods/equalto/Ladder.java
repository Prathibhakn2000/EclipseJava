package com.xworkz.objectmethods.equalto;

public class Ladder {
	
	public String brand;
	public int price;
	public String color;
	public float height;
	public int weight;
	public String type;
	
	
	public Ladder()
	{
		System.out.println("running no param const in ladder");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Ladder class" +this);
		System.out.println("running equals in Ladder class" +obj);
		if(obj!=null && obj instanceof Ladder )
		{
			Ladder other=(Ladder)obj;
			if(this.brand.equals(other.brand)&& this.price==other.price && (this.color.equals(other.color)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Ladder-Brand: "+this.brand+ ", Price:" +this.price+ ", Color:" +this.color+ ", height:" +this.height+ ", weight:" +this.weight+ ", Type:" +this.type ;
	}

}
