package com.xworkz.handwash;

import com.xworkz.handwash.like.HandWash;
import com.xworkz.handwash.like.Lux;
import com.xworkz.handwash.like.Road;
import com.xworkz.handwash.like.Sanitizer;
import com.xworkz.handwash.like.Soap;

public class HandWashRunner {

	public static void main(String[] args) {
		
		Road road = new Road();
		HandWash handwash = new HandWash();
		road.runHandWash(handwash);
		
		System.out.println("___________________________");
		
		
		Sanitizer handwash1 = new Sanitizer();
		road.runHandWash(handwash1);
		
		System.out.println("___________________________");
		
		Soap handwash2 = new Soap();
		road.runHandWash(handwash2);
		
		System.out.println("___________________________");
		
		Lux handwash3 = new Lux();
		road.runHandWash(handwash3);
		
		
		

	}

}
