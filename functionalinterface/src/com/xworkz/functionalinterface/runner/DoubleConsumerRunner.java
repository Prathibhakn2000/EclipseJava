package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.DoubleConsumerCheck;

public class DoubleConsumerRunner {

	public static void main(String[] args) {
		
		DoubleConsumerCheck d=new DoubleConsumerCheck((s)->{
			System.out.println("Runing in DoubleConsumerRunner");
			System.out.println(s);
		});
		d.fly();
		
		

	}

}
