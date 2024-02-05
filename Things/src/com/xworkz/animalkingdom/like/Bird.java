package com.xworkz.animalkingdom.like;

public class Bird extends AnimalKingdom{
	
	@Override
	public void eat()
	{
		System.out.println("running eat in bird");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("running sleep  in bird");
	}
	
	@Override
	public void walk()
	{
		System.out.println("running walk  in bird");
	}
	
	
	public void fly()
	{
		System.out.println("running fly  in bird");
	}
	
	public void makeSound()
	{
		System.out.println("running makesound  in bird");
	}

}
