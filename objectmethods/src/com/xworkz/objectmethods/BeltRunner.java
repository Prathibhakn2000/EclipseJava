package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Belt;

public class BeltRunner{

		public static void main(String[] args) {
			
			Belt belt = new Belt();
			belt.length=12;
			belt.material="leather";
			belt.price=120;
			belt.type="athletic";
			
			Belt belt1 = new Belt();
			belt1.length=12;
			belt1.material="leather";
			belt1.price=120;
			belt1.type="athletic";
			
			Belt belt2 = new Belt();
			belt2.length=17;
			belt2.material="nylon";
			belt2.price=280;
			belt2.type="reversible";
			
			Belt belt3 = new Belt();
			belt3.length=17;
			belt3.material="nylon";
			belt3.price=280;
			belt3.type="reversible";
			
			boolean ref= belt.equals(null);
			System.out.println(ref);
			
			boolean ref1= belt.equals(belt1);
			System.out.println(ref1);
			
			boolean ref2= belt.equals(belt2);
			System.out.println(ref2);
			
			boolean ref3= belt2.equals(belt3);
			System.out.println(ref3);
			
			
			
			
			
			
			
		}

	}



