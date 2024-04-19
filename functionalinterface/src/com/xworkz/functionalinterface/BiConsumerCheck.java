package com.xworkz.functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerCheck {
	
	private BiConsumer<Integer, Integer> biconsumer;



	public BiConsumerCheck(BiConsumer<Integer, Integer> biconsumer) {
		this.biconsumer=biconsumer;
	}
	
	

	public void add() {
		System.out.println("Running add in BiConsumerCheck");
		biconsumer.accept(200, 30);
	}

}