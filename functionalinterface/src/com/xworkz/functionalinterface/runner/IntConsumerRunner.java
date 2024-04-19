package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.IntConsumerCheck;

public class IntConsumerRunner {

	public static void main(String[] args) {
		
		IntConsumerCheck ic=new IntConsumerCheck((d)->
		{
			System.out.println(d+10);
		});
		ic.sale();
	}

}
