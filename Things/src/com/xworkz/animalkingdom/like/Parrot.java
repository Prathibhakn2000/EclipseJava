package com.xworkz.animalkingdom.like;

public class Parrot extends Bird{
	
	@Override
	public void eat()
	{
		System.out.println("running eat");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("running sleep in parrot");
	}
	
	@Override
	public void walk()
	{
		System.out.println("running walk in parrot");
	}
	
	@Override
	public void fly()
	{
		System.out.println("running fly in parrot");
		
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("running makesound in parrot");
	}

	
	public void talk()
	{
		System.out.println("running talk in parrot ");
	}
	
	public void parrotAstrology()
	{
		System.out.println("running parrotAstrology in parrot");
	}
	
}
