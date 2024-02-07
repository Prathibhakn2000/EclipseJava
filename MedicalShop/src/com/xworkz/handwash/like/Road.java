package com.xworkz.handwash.like;

public class Road {
	
	public void runHandWash(HandWash handwash)
	{
		System.out.print(handwash.aroma);
		handwash.clean();
		
		if(handwash instanceof Sanitizer)
		 {
			Sanitizer sanitizer = (Sanitizer)handwash;
			System.out.print(sanitizer.quality);
			sanitizer.disinfect();
			
		  }
		
		else if(handwash instanceof Soap)
		  {
			Soap soap =(Soap)handwash;
			System.out.print(soap.price);
			soap.foam();
		  }

	         if(handwash instanceof Lux)
	      {
			Lux lux =(Lux)handwash;
			System.out.println(lux.manifactringYear);
			lux.makeYoung();
		  }
	}

}
