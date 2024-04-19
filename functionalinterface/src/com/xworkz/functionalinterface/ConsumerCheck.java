package com.xworkz.functionalinterface;

import java.util.function.Consumer;

public class ConsumerCheck {
	
	private Consumer<Double>consumer;

	
	
	public ConsumerCheck(Consumer<Double> consumer)
	{
		this. consumer = consumer;
	}
	
	public void write()
	{
		System.out.println("running write in ConsumerCheck");
		
		consumer.accept(34D);
		
	}
	

}
