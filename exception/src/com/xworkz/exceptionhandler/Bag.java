package com.xworkz.exceptionhandler;

public class Bag {
	
	public void buyBag(int price) throws BagException
	{
	  if(price<1000 && price>500)
	  {
		  System.out.println("Bag quality is  good");
	  }
	  
	  else if(price<500 && price > 200)
	  {
		  System.out.println("Bag quality is Average");
	  }
	  
	  else if(price< 200)
	  {
		  System.out.println("Bag quality is bad");
		  throw new BagException("Bag quality is poor don't buy");
	  }
	}

}
