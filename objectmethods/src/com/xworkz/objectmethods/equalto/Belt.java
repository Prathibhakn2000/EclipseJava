package com.xworkz.objectmethods.equalto;

public class Belt {
		public int length;
		public String type;
		public String material;
		public int price;
		
		public Belt()
		{
			System.out.println("running no parameters arg const...");
		}
		

		@Override
		public boolean equals(Object obj) {
			System.out.println("running equals in belt class" +this);
			System.out.println("running equals in belt class" +obj);
			if(obj!=null && obj instanceof Belt)
			{
				Belt others=(Belt)obj;
				if(this.length==others.length && this.material.equals(others.material) && this.price==others.price && this.type.equals(others.type))
				{
				  return true;
			   }
			     
			}
			return false;
		}
		
		@Override
		public String toString() {
			
			return " Belt-length: " +this.length+ ",Type:" +this.type+ ", Material: " +this.material+ ", price: " +this.price;
		}
		

	}



