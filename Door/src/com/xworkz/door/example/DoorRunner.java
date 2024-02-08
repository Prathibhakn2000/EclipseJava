package com.xworkz.door.example;

import com.xworkz.door.example.like.Door;
import com.xworkz.door.example.like.SlidingDoor;
import com.xworkz.door.example.like.SteelDoor;
import com.xworkz.door.example.like.Wood;

public class DoorRunner {

	public static void main(String[] args) {
		
		Wood wood =new Wood();
		Door door = new Door();
		wood.run(door);
		
		//System.out.println(door.material);
		//door.security();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		SlidingDoor slidingdoor = new SlidingDoor();
		wood.run(slidingdoor);
		
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		 Door door2 = new SlidingDoor();
		wood.run(door2);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		

	    SteelDoor steeldoor2 = new SteelDoor ();
		wood.run(steeldoor2);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Door door3 = new SteelDoor();
		wood.run(door3);
			
	}

}
