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
		
		
		
		
		
		
	}

}
