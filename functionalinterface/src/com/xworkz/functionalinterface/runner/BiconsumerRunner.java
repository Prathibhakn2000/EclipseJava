package com.xworkz.functionalinterface.runner;

import java.util.function.BiConsumer;

import com.xworkz.functionalinterface.BiConsumerCheck;

public class BiconsumerRunner {

	public static void main(String[] args) {
		
		//BiConsumer<Integer,Integer> consumer=(t,b)->{    //impl of functional interface 
					//};
		
		//BiConsumerCheck check=new BiConsumerCheck(consumer);
		//check.add();
		
		BiConsumerCheck check=new BiConsumerCheck((Integer t,Integer b)->{
			System.out.println("adding 2 numbers is: " +(t+b));
		}); 
		check.add();
		
		
	}

}
