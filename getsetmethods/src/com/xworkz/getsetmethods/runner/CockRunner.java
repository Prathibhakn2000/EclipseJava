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
	
	
	

	}

}
