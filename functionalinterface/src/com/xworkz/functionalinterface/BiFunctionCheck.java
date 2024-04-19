package com.xworkz.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionCheck {
	
	private BiFunction<String ,String,Boolean> bifunction;

	public BiFunctionCheck(BiFunction<String, String, Boolean> bifunction) {
		this.bifunction=bifunction;
		
		
	}
	
	public void read()
	{
		System.out.println("Running read in BiFunctionCheck");
		boolean val=bifunction.apply("hi", "hello");

		if(val)
		{
			System.out.println("apply");
		}
		else {
			System.out.println("not apply");
		}
			}

}
