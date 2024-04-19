package com.xworkz.functionalinterface;

import java.util.function.Function;

public class FunctionCheck {
	
	private Function<Integer, String> function;
	
	public FunctionCheck(Function<Integer, String> function) {
		this.function=function;
		
	}
	
	

	public void start()
	{
		System.out.println("Running start in Function");
		String s= this.function.apply(1000);
		if(s.equals("hi"))
		{
			System.out.println("Prathi");
		}
		else
		{System.out.println("not");
	}

}}
