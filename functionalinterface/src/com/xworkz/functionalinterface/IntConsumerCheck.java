package com.xworkz.functionalinterface;

import java.util.function.IntConsumer;

public class IntConsumerCheck {
	
	private IntConsumer intConsumer;
	
	public IntConsumerCheck(IntConsumer intConsumer) {
		this.intConsumer=intConsumer;
	}
	
	public void sale()
	{
		System.out.println("Running sale in IntConsumerCheck ");
		intConsumer.accept(12);
	}
}
