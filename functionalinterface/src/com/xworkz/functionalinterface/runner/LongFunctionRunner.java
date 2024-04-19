package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.LongFunctionCheck;

public class LongFunctionRunner {

	public static void main(String[] args) {
		
		LongFunctionCheck lfc=new LongFunctionCheck((j)->
		{
			System.out.println(j+2000);
			return 123d;
			
		});
		lfc.act();

	}

}
