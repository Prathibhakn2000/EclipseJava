package com.xworkz.objectmethods.equalto;

public class Shoe {
	public String color;
	public int size;
	public String brand;
	public int laceLength;
	public int price;
	public int weight;
	
	public Shoe()
	{
		System.out.println("running no param const in shoe");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in shoe class" +this);
		System.out.println("running equals in shoe class" +obj);
		if(obj!=null && obj instanceof Shoe )
		{
			Shoe other=(Shoe)obj;
			if(this.color.equals(other.color)&& this.size==other.size && (this.brand.equals(other.brand)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " shoe-color: "+this.color+ ", Size:" +this.size+ ", Brand:" +this.brand+ ", laceLength:" +this.laceLength+ ", price:" +this.price+ ", weight:" +this.weight ;
	}

}

	
	

	


