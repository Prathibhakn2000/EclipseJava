package com.xworkz.functionalinterface;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctioncheck {
	
	private DoubleToIntFunction doubleToIntFunction;

	public DoubleToIntFunctioncheck(DoubleToIntFunction doubleToIntFunction) {
		this.doubleToIntFunction=doubleToIntFunction;
	}
	
	public void buy()
	{
		System.out.println("Running buy in DoubleToIntFunction");
		int i=doubleToIntFunction.applyAsInt(1223.899d);
		
		
	}
}
