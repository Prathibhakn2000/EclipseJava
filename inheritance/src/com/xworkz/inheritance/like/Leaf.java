package com.xworkz.inheritance.like;

public class Leaf {
	
	public void active(Flower flower)
	{
		flower.givesGoodSmell();
	
	
	if(flower instanceof SunFlower)
	{
		
		SunFlower sunflower = (SunFlower)flower;
		sunflower.givesCookingOil();
		
	}

}
}