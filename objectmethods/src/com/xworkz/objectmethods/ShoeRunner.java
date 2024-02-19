package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		
		Shoe shoe = new Shoe();
		shoe.color="pink";
		shoe.size=6;
		shoe.brand="bata";
		
		Shoe shoe1 = new Shoe();
		shoe1.color="pink";
		shoe1.size=7;
		shoe1.brand="bata";
		
		Shoe shoe2 = new Shoe();
		shoe2.color="pink";
		shoe2.size=6;
		shoe2.brand="bata";
		
		Shoe shoe3 = new Shoe();
		shoe3.color="black";
		shoe3.size=6;
		shoe3.brand="bata";
		
		boolean ref = shoe.equals(null);
		System.out.println(ref);
		
		boolean ref1 = shoe.equals(shoe1);
		System.out.println(ref1);
		
		boolean ref2 = shoe.equals(shoe2);
		System.out.println(ref2);
		
		boolean ref3 = shoe2.equals(shoe3);
		System.out.println(ref3);
	}
	
		

	}


