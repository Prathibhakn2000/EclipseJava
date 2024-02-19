package com.xworkz.objectmethods.equalto;

public class Carrom {
	
	public String brand;
	public int price;
	public String color;
	public String stikerShape;
	public String stikerColor;
	public int weight;
	
	public Carrom()
	{
		System.out.println("running no param const in carrom");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in carrom class" +this);
		System.out.println("running equals in carrom class" +obj);
		if(obj!=null && obj instanceof Carrom )
		{
			Carrom other=(Carrom)obj;
			if(this.color.equals(other.color)&& this.price==other.price && (this.brand.equals(other.brand)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Carrom-brand: "+this.brand+ ", price:" +this.price+ ", color:" +this.color+ ", stikerShape:" +this.stikerShape+ ", stikerColor:" +this.stikerColor+ ", weight:" +this.weight ;
	}

}

	
	

	



	


