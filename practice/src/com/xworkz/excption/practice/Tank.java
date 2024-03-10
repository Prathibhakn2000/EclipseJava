package com.xworkz.excption.practice;

public class Tank {
	
	public void fill(int time) throws TankException
	{
		if(time >= 1 && time <= 6)
		{
			System.out.println("good condition");
		}
		else
		{
			System.out.println("bad condition");
			throw new TankException();
		}
	}

}
