package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Lace;

public class LaceRunner {

	public static void main(String[] args) {
		
		Lace lace =new Lace();
		lace.color="white";
		lace.length=9;
		lace.price=55;
		
		Lace lace1 =new Lace();
		lace1.color="white";
		lace1.length=9;
		lace1.price=55;
		
		Lace lace2 =new Lace();
		lace2.color="white";
		lace2.length=9;
		lace2.price=55;
		
		Lace lace3 =new Lace();
		lace3.color="white";
		lace3.length=9;
		lace3.price=70;
		

		boolean ref = lace.equals(null);
		System.out.println(ref);
		
		boolean ref1 = lace.equals(lace1);
		System.out.println(ref1);
		
		boolean ref2 = lace.equals(lace2);
		System.out.println(ref2);
		
		boolean ref3 = lace2.equals(lace3);
		System.out.println(ref3);

	}

}
