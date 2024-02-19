package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Carrom;

public class CarromRunner {
  public static void main(String[] args) {
	
	  Carrom carrom =new Carrom();
	  carrom.brand="synco";
	  carrom.price=5000;
	  carrom.color="black";
	  
	  Carrom carrom1 =new Carrom();
	  carrom1.brand="synco";
	  carrom1.price=4000;
	  carrom1.color="black";
	  
	  Carrom carrom2 =new Carrom();
	  carrom2.brand="synco";
	  carrom2.price=5000;
	  carrom2.color="white";
	  
	  Carrom carrom3 =new Carrom();
	  carrom3.brand="synco";
	  carrom3.price=5000;
	  carrom3.color="white";
	  

		boolean ref = carrom.equals(null);
		System.out.println(ref);
		
		boolean ref1 = carrom.equals(carrom1);
		System.out.println(ref1);
		
		boolean ref2 = carrom.equals(carrom2);
		System.out.println(ref2);
		
		boolean ref3 = carrom2.equals(carrom3);
		System.out.println(ref3);
}
}
