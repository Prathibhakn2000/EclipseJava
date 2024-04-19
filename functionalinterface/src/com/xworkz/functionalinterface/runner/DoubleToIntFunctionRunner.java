package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.DoubleToIntFunctioncheck;

public class DoubleToIntFunctionRunner {

	public static void main(String[] args) {
		
				
		DoubleToIntFunctioncheck d=new DoubleToIntFunctioncheck((r)-> 
				{  
		           System.out.println(r*2);
		           return 20;
				});
		d.buy();
	}
	

}
