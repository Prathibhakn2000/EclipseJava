package com.xworkz.abstractclass;

public class WoodDoor extends Door {

	@Override
	void security() {
		System.out.println("it gives security");
		
	}

	@Override
	void close() {
		System.out.println("close door"); 
		
	}

}
