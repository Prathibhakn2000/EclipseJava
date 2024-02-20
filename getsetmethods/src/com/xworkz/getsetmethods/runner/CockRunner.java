package com.xworkz.getsetmethods.runner;

import com.xworkz.getsetmethods.Cock;

public class CockRunner {

	public static void main(String[] args) {
	Cock cock= new Cock();
	System.out.println(cock);
	cock.price=25;
	cock.weight=1;
	cock.setColor("Yellow");
	String val=cock.getColor();
	System.out.println(val);
	cock.setMaterial("Plastic");
	String val2=cock.getMaterial();
	System.out.println(val2);
	cock.setMadeIn("India");
	String val3=cock.getMadeIn();
	System.out.println(val3);
	System.out.println(cock);
	
	
	Cock cock1= new Cock();
	System.out.println(cock1);
	cock1.price=30;
	cock1.weight=2;
	cock1.setColor("white");
	String value=cock1.getColor();
	System.out.println(value);
	cock1.setMaterial("Plastic");
	String value2=cock1.getMaterial();
	System.out.println(value2);
	cock1.setMadeIn("India");
	String value3=cock.getMadeIn();
	System.out.println(value3);
	System.out.println(cock1);
	
	boolean ref=cock.equals(cock1);
	System.out.println(ref);
	
	
	

	}

}
