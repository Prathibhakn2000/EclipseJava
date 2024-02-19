package com.xworkz.objectmethods.equalto;

public class Sock {
	
	public String material;
	public int length;
	public String color;
	public String brand;
	public int price;
	public String design;
	
	public Sock()
	{
		System.out.println("running no param const in Sock");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in sock class" +this);
		System.out.println("running equals in sock class" +obj);
		if(obj!=null && obj instanceof Sock )
		{
			Sock other=(Sock)obj;
			if(this.material.equals(other.material)&& this.length==other.length && (this.color.equals(other.color)))
					{
				     return true;
					}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return " Sock-material: "+this.material+ ", length:" +this.length+ ", color:" +this.color+ ", brand:" +this.brand+ ", price:" +this.price+ ", design:" +this.design;
	}
	


}
