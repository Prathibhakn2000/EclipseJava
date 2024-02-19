package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Fan;

public class FanRunner {
	public static void main(String[] args) {
		
		Fan fan = new Fan();
		fan.brand="havells";
		fan.price=3000;
		fan.color="white";
		
		Fan fan1 = new Fan();
		fan1.brand="havells";
		fan1.price=3000;
		fan1.color="white";
		
		Fan fan2 = new Fan();
		fan2.brand="usha";
		fan2.price=5000;
		fan2.color="blue";
		
		Fan fan3 = new Fan();
		fan3.brand="havells";
		fan3.price=6000;
		fan3.color="black";
		
		boolean ref = fan.equals(null);
		System.out.println(ref);
		
		boolean ref1 = fan.equals(fan1);
		System.out.println(ref1);
		
		boolean ref2 = fan.equals(fan2);
		System.out.println(ref2);
		
		boolean ref3 = fan2.equals(fan3);
		System.out.println(ref3);
	}
	
	

}
