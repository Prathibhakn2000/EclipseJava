package com.xworkz.getsetmethods.runner;

import com.xworkz.getsetmethods.Box;

public class BoxRunner {

	public static void main(String[] args) {
		
		Box box = new Box();
		System.out.println(box);
		
		box.setBrand("Oliveware");
		String value=box.getBrand();
		System.out.println(value);
		System.out.println(box);
		
		
		box.setColor("blue");
		String value1=box.getColor();
		System.out.println(value1);
		System.out.println(box);
		
		box.setShape("round");
		String value2=box.getShape();
		System.out.println(value2);
		System.out.println(box);
		
		box.setPrice(150);
		int value3=box.getPrice();
		System.out.println(value3);
		System.out.println(box);
		
		box.setMaterial("Plastic");
		String value4=box.getMaterial();
		System.out.println(value4);
		System.out.println(box);
		
		
		Box box1 = new Box();
		System.out.println(box1);
		
		box1.setBrand("Oliveware");
		String val=box1.getBrand();
		System.out.println(val);
		System.out.println(box1);
		
		
		box1.setColor("blue");
		String val1=box1.getColor();
		System.out.println(val1);
		System.out.println(box1);
		
		box1.setShape("round");
		String val2=box1.getShape();
		System.out.println(val2);
		System.out.println(box1);
		
		box1.setPrice(150);
		int val3=box1.getPrice();
		System.out.println(val3);
		System.out.println(box1);
		
		box1.setMaterial("Plastic");
		String val4=box1.getMaterial();
		System.out.println(val4);
		System.out.println(box1);
		
		boolean ref=box.equals(box1);
		System.out.println(ref);
	}

}
