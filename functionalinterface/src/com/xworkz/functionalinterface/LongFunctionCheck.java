package com.xworkz.functionalinterface;

import java.util.function.LongFunction;

public class LongFunctionCheck {
	
	private LongFunction<Double> longFunction;
	
	public LongFunctionCheck(LongFunction<Double> longFunction) {
		this.longFunction=longFunction;
		
	}
	
	public void act() {
		System.out.println("Running act in LongFunctionCheck");
		double d= longFunction.apply(12677l);
		if(d>2000)
		{
			System.out.println("greater");
			
		}
		else
		{
			System.out.println("lesser");
		}
	}

}
