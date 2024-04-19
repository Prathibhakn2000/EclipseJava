package com.xworkz.functionalinterface;

import java.util.function.Supplier;

public class SupplierCheck {
	private Supplier<Boolean> supplier;
	
	
	public SupplierCheck(Supplier<Boolean> supplier) 
	{
		this.supplier=supplier;
	}
	
	public void run()
	{
		System.out.println("Running run in SupplierCheck");
		boolean b= supplier.get();
		if(b=true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
