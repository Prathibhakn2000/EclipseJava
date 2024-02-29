package com.xworkz.exceptionhandler;

public class Television {
	
	public void buyTV(int price) throws TelevisionException
	{
		if(price<=65000)
		{
			System.out.println("cost of tv is minimum");
		}
		else
		{
			System.out.println("cost of tv is maximum");
			throw new TelevisionException("cost of tv is more");
		}
		
	}

}
