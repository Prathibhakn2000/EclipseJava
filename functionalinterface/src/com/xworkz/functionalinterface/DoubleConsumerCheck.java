package com.xworkz.functionalinterface;

import java.util.function.DoubleConsumer;

public class DoubleConsumerCheck {
	
	private DoubleConsumer doubleconsumer;


public DoubleConsumerCheck(DoubleConsumer doubleconsumer)
{
	this.doubleconsumer=doubleconsumer;
}

public void fly() {
	System.out.println("running fly in DoubleConsumer");
	doubleconsumer.accept(23.788d);
}

}