package com.xworkz.getsetmethods;

public class NailPolish {
	
	String brand="Nykaa";
	private String color="blue";
	private int price=200;
	private int manifacturingYear=2020;
	private String madeIn="Bengaluru";
	
	public NailPolish()
	{
		System.out.println("running no param const in Nailpolish");
	}
	
	@Override
	public String toString() {
	
	return  " NailPolish-Brand:"+this.brand+ ", Color:"+this.color+ ",manifacturingYear :"+this.manifacturingYear+ ", Price:"+this.price+ ", madeIn:"+this.madeIn;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof NailPolish)
		{
			NailPolish nail=(NailPolish)obj;
			if(this.brand.equals(nail.brand) && this.color.equals(nail.color) && this.manifacturingYear==nail.manifacturingYear && this.price==nail.price && this.madeIn==nail.madeIn) 
					{
				      return true;
					}
	 
		}
	
		return false ;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getManifacturingYear()
	{
		return manifacturingYear;
	}
	
	public String getMadeIn()
	{
		return madeIn;
	}
	
	public void setMadeIn(String madeIn) {
		 this.madeIn=madeIn;
		
	}

	
	
	

}
