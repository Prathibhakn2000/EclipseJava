package com.xworkz.objectmethods.equalto;

public class Glass {
	
	public int price;
	public float height;
	public byte quality;
	public int hardness;
	public String design;
	public boolean transparency;
	
	public Glass()
	{
		System.out.println("running no param comst in Glass");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Glass class" +this);
		System.out.println("running equals in glass class" +obj);
		if(obj!=null && obj instanceof Glass)
		{
			Glass others=(Glass)obj;
			if(this.price==others.price && this.design.equals(others.design) && this.quality==others.quality)
			{
			  return true;
		   }
		     
		}
		return false;
	}
		
	
	@Override
	public String toString() {
		return " Glass-Price: "+this.price+ ", Height: "+this.height+ ", Quality: " +this.quality+ ",Hardness: "+this.hardness+ ", Design:"+this.design+ ", Transparency:"+this.transparency;
	}

}
