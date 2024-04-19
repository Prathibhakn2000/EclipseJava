package com.xworkz.functionalinterface.runner;

import java.util.function.Supplier;

import com.xworkz.functionalinterface.SupplierCheck;

public class SupplierRunner {

	public static void main(String[] args) {
		
		
		
		SupplierCheck c=new SupplierCheck(()->true);
        c.run();
	}

}
