package com.xworkz.functionalinterface;

public class FestivalCheck {
	
	private Festival festival;
	
	public FestivalCheck(Festival festival ) {
		this.festival= festival;
	}
	
	public void check()
	{
		System.out.println("Running check in FestivalCheck");
		boolean val=this.festival.prepare("sweet", "flower");
		if(val)
		{
			System.out.println("Prepared");
		}
		else 
		{
			System.out.println(" Not prepared");
		}
	}

}
