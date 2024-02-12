package com.xworkz.inheritance;

import com.xworkz.inheritance.like.Flower;
import com.xworkz.inheritance.like.Leaf;
import com.xworkz.inheritance.like.SunFlower;

public class FlowerRunner {

	public static void main(String[] args) {
		
		Leaf leaf = new Leaf();
		
		Flower flower =new Flower();
		
		leaf.active(flower);
		
		System.out.println("======================");
		
		SunFlower sunflower = new SunFlower();
		leaf.active(sunflower);
		
		
		

	}

}
