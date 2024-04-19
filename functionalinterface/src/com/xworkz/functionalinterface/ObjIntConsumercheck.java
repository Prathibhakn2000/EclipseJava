package com.xworkz.functionalinterface;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumercheck {
	
	private ObjIntConsumer<Double> objintconsumer;
	
	public ObjIntConsumercheck(ObjIntConsumer<Double> objintconsumer) {
		this.objintconsumer=objintconsumer;
	}
	
	public void play()
	{
		System.out.println("Running play in ObjIntConsumercheck");
		objintconsumer.accept(125d, 30);
		
	}

}
