package com.xworkz.practice.example;

public class Chocolate {
	 
	
	public void taste(String name) throws Exception
	{
		System.out.println("chocolate gives taste");
		
		


	if(name.equals("DairyMilk"))
	{
		System.out.println("DairyMilk gives good taste");
	}
	else if(name.equals("MilkyBar"))
	{
		System.out.println("MilkyBar gives bad taste");
		throw new Exception("MilkyBar don't buy");
	}
	}
}


