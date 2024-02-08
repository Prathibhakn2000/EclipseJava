package com.xworkz.door.example.like;

 public class Wood {
	
	public void run(Door door)
	{
		door.material="wooden";
		System.out.println(door.material);
		door.security();
		
		
		if(door instanceof SlidingDoor)
		{
			SlidingDoor slidingDoor = (SlidingDoor)door;
			slidingDoor.length=8.5f;
			System.out.println(slidingDoor.length);
			slidingDoor.close();
			
			
		}
		
		else if(door instanceof SteelDoor)
		{
			SteelDoor steelDoor =(SteelDoor)door;
			steelDoor.color="black";
			System.out.println(steelDoor.color);
			steelDoor.open();
			
	}
	}
}


