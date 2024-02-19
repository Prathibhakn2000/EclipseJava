package com.xworkz.objectmethods.equalto;

public class Plate {
	
	public String color;
	public int price;
	public String shape;
	public String design;
	public String material;
	public int weight;
	
	
	public Plate()
	{
		System.out.println("running no param const in plate");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in plate class" +this);
		System.out.println("running equals in plate class" +obj);
		if(obj!=null && obj instanceof Plate )
		{
			Plate other=(Plate)obj;
			if(this.color.equals(other.color)&& this.price==other.price && (this.shape.equals(other.shape)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Plate-Color: "+this.color+ ", Price:" +this.price+ ", Shape:" +this.shape+ ", Design:" +this.design+ ", weight:" +this.weight+ ", Materail:" +this.material ;
	}

}

	
	
