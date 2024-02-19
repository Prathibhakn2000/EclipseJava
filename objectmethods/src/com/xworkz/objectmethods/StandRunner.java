package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Stand;

public class StandRunner {

	public static void main(String[] args) {
	
		Stand stand= new Stand();
		stand.brand="table magic";
		stand.price=900;
		stand.height=6;
		
		Stand stand1= new Stand();
		stand1.brand="table magic";
		stand1.price=900;
		stand1.height=6;
		
		Stand stand2= new Stand();
		stand2.brand="table magic";
		stand2.price=900;
		stand2.height=6;
		
		Stand stand3= new Stand();
		stand3.brand="table magic";
		stand3.price=900;
		stand3.height=6;
		
		boolean ref = stand.equals(null);
		System.out.println(ref);
		
		boolean ref1 = stand.equals(stand1);
		System.out.println(ref1);
		
		boolean ref2 = stand.equals(stand2);
		System.out.println(ref2);
		
		boolean ref3 = stand2.equals(stand3);
		System.out.println(ref3);
		
		

	}

}
