package com.xworkz.getsetmethods.runner;

import com.xworkz.getsetmethods.Basket;

public class BasketRunner {

	public static void main(String[] args) {
		
		Basket basket = new Basket();
		System.out.println(basket);
		basket.material="plastic";
		basket.setType("carry");
		String val=basket.getType();
		System.out.println(val);
		System.out.println(basket);
		
		basket.color="green";
		System.out.println(basket);
		
		basket.setMadeIn("Hassan");
		String val2=basket.getMadeIn();
		System.out.println(val2);
		System.out.println(basket);
		
		basket.setPrice(500);
		System.out.println(basket);
		
		
		Basket basket1 = new Basket();
		System.out.println(basket1);
		basket1.material="plastic";
		basket1.setType("carry");
		String value=basket.getType();
		System.out.println(value);
		System.out.println(basket1);
		
		basket1.color="green";
		System.out.println(basket1);
		
		basket1.setMadeIn("Hassan");
		String value2=basket1.getMadeIn();
		System.out.println(value2);
		System.out.println(basket1);
		
		basket1.setPrice(200);
		System.out.println(basket1);
		

		boolean ref=basket.equals(basket1);
		System.out.println(ref);
		
		
		
		
		
		
		
		
	}

}
