package com.xworkz.functionalinterface;

import java.util.function.ToLongFunction;

public class ToLongFunctionCheck {
	
	private ToLongFunction<Integer> toLongFunction;
	
	public ToLongFunctionCheck(ToLongFunction<Integer> toLongFunction) {
		this.toLongFunction=toLongFunction;
	}
	
	public void check()
	{
		System.out.println("Running in ToLongFunctionCheck");
		long l =toLongFunction.applyAsLong(20000);
		if(l>10000)
		{
			System.out.println("greater");
		}
		else
		{
			System.out.println("lesser");
		}
	}

}
