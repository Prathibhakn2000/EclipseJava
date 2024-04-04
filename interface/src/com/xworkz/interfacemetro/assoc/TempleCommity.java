package com.xworkz.interfacemetro.assoc;

import com.xworkz.interfacemetro.TempleRule;

public class TempleCommity {
	
	private TempleRule templerule;
	
	public TempleCommity(TempleRule templerule) 
	{
		this.templerule=templerule;
		
	}
	
	
	public void openTimings()
	{
		if(templerule!=null)
		{
			double time1=templerule.openTime();
			System.out.println("temple opening time is "+time1+"am");
		}
		System.out.println("-------------------------------------");
		
	}
	
	public void closeTimings()
	{
		if(templerule!=null)
		{
			double time2=templerule.closeTime();
			System.out.println("temple closing time is "+time2+"pm");
		}
		System.out.println("-------------------------------------");
	}

	public void costOfSpecialEntry()
	{
		if(templerule!=null)
		{
			double cost=templerule.specialEntry();
			System.out.println("temple specialEntry cost is "+cost+"rupees");
		}
	}


}

