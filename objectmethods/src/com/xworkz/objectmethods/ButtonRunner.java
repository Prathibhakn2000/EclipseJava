package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Button;

public class ButtonRunner {
	public static void main(String[] args) {
		
		Button button = new Button();
		button.brand="ZincButton";
		button.price=5;
		button.color="red";
		
		Button button1 = new Button();
		button1.brand="ZincButton";
		button1.price=10;
		button1.color="black";
		
		Button button2 = new Button();
		button2.brand="ZincButton";
		button2.price=5;
		button2.color="white";
		
		Button button3 = new Button();
		button3.brand="ZincButton";
		button3.price=5;
		button3.color="red";
		
		boolean ref = button.equals(null);
		System.out.println(ref);
		
		boolean ref1 = button.equals(button1);
		System.out.println(ref1);
		
		boolean ref2 = button.equals(button2);
		System.out.println(ref2);
		
		boolean ref3 = button2.equals(button3);
		System.out.println(ref3);

		
	}

}
