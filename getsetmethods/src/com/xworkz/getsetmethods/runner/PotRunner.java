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
		
		

	}

}
