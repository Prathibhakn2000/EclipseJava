package com.xworkz.getsetmethods.runner;

import com.xworkz.getsetmethods.Pot;

public class PotRunner {

	public static void main(String[] args) {
		
		Pot pot = new Pot();
		System.out.println(pot);
		
		pot.setColor("brown");
		String val=pot.getColor();
		System.out.println(val);
		System.out.println(pot);
		
		pot.length=12;
		System.out.println(pot);
		
		pot.material="plastic";
		System.out.println(pot);
		
		pot.setPrice(300);
		int val2=pot.getPrice();
		System.out.println(val2);
		System.out.println(pot);
		
		
		pot.setWeight(3);
		int val3=pot.getWeight();
		System.out.println(val3);
		System.out.println(pot);
		
		

		Pot pot1 = new Pot();
		System.out.println(pot1);
		
		pot1.setColor("brown");
		String value=pot.getColor();
		System.out.println(value);
		System.out.println(pot1);
		
		pot1.length=22;
		System.out.println(pot1);
		
		pot1.material="plastic";
		System.out.println(pot1);
		
		pot1.setPrice(300);
		int value2=pot1.getPrice();
		System.out.println(value2);
		System.out.println(pot1);
		
		
		pot1.setWeight(3);
		int value3=pot1.getWeight();
		System.out.println(value3);
		System.out.println(pot1);
		
		boolean ref=pot.equals(pot1);
		System.out.println(ref);
		
		

	}

}
