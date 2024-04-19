package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.ConsumerCheck;

public class ConsumerRunner {

	public static void main(String[] args) {
		 
		ConsumerCheck c=new ConsumerCheck((d)->{
			System.out.println("ConsumerCheck");
			System.out.println(d);
			});
        c.write();
	}

}
