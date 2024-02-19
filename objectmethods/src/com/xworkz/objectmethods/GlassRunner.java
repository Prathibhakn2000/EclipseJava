package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Glass;

public class GlassRunner {

	public static void main(String[] args) {
		
		Glass glass = new Glass();
		glass.price=390;
		glass.design="rectangle";
		glass.quality=4;
		
		Glass glass1 = new Glass();
		glass1.price=390;
		glass1.design="rectangle";
		glass1.quality=5;
		
		Glass glass2 = new Glass();
		glass2.price=390;
		glass2.design="rectangle";
		glass2.quality=4;
		
		Glass glass3 = new Glass();
		glass3.price=470;
		glass3.design="rectangle";
		glass3.quality=4;
		
		
		boolean ref = glass.equals(null);
		System.out.println(ref);
		
		boolean ref1 = glass.equals(glass1);
		System.out.println(ref1);
		
		boolean ref2 = glass.equals(glass2);
		System.out.println(ref2);
		
		boolean ref3 = glass2.equals(glass3);
		System.out.println(ref3);
		
		
		

	}

}
