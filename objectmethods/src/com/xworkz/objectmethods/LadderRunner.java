package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Ladder;

public class LadderRunner {
	
	public static void main(String[] args) {
			
			Ladder ladder = new Ladder();
			ladder.brand="Runner-up";
			ladder.price=3000;
			ladder.color="white";
			
			Ladder ladder1 = new Ladder();
			ladder1.brand="Runner-up";
			ladder1.price=4000;
			ladder1.color="white";
			
			Ladder ladder2 = new Ladder();
			ladder2.brand="Runner-up";
			ladder2.price=3000;
			ladder2.color="black";
			
			Ladder ladder3 = new Ladder();
			ladder3.brand="Runner-up";
			ladder3.price=3000;
			ladder3.color="black";
			
			boolean ref = ladder.equals(null);
			System.out.println(ref);
			
			boolean ref1 = ladder.equals(ladder1);
			System.out.println(ref1);
			
			boolean ref2 = ladder.equals(ladder2);
			System.out.println(ref2);
			
			boolean ref3 = ladder2.equals(ladder3);
			System.out.println(ref3);
			
			
			

		}

	}



