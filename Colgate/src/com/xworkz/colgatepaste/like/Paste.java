package com.xworkz.colgatepaste.like;

public class Paste {
	
	public void clean(Colgate colgate)
	{
		colgate.brandName="Colgate";
		colgate.flavor="salt";
		
		System.out.println(colgate.brandName);
		System.out.println(colgate.flavor);
		colgate.open();
		
		
		if(colgate instanceof ColgateStrongTeeth)
		{
			ColgateStrongTeeth colgateStrongTeeth = (ColgateStrongTeeth)colgate;
			colgateStrongTeeth.quantity="500g";
			colgateStrongTeeth.price=50;
			System.out.println(colgateStrongTeeth.quantity);
			System.out.println(colgateStrongTeeth.price);
			colgateStrongTeeth.teethWhitening();
			
		}
		
		else if(colgate instanceof ColgateCharcoal)
		{
			ColgateCharcoal colgateCharcoal =(ColgateCharcoal)colgate;
			colgateCharcoal.manifactoringYear=2020;
			colgateCharcoal.color="black";
			System.out.println(colgateCharcoal.manifactoringYear);
			System.out.println(colgateCharcoal.color);
			colgateCharcoal.close();
			
			
		}
	}

}
