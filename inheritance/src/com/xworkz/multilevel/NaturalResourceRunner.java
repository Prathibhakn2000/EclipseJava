package com.xworkz.multilevel;

import com.xworkz.multilevel.like.BottledNaturalMineralWater;
import com.xworkz.multilevel.like.Juice;
import com.xworkz.multilevel.like.MineralWater;
import com.xworkz.multilevel.like.NaturalMineralWater;
import com.xworkz.multilevel.like.NaturalResource;
import com.xworkz.multilevel.like.Water;

public class NaturalResourceRunner {
	
	public static void main(String[] args) {
		Juice juice = new Juice();
		NaturalResource natural= new NaturalResource();
		juice.energy(natural);
		
		System.out.println("=========================");
		
		Water water = new Water();
		juice.energy(water);
		
		System.out.println("=========================");
		
		MineralWater mineralwater = new MineralWater();
		juice.energy(mineralwater);
		
		System.out.println("=========================");
		
		NaturalMineralWater naturalmineralwater = new NaturalMineralWater();
		juice.energy(naturalmineralwater);
		
		System.out.println("=========================");
		
		BottledNaturalMineralWater bottlednaturalmineralwater= new BottledNaturalMineralWater();
		juice.energy(bottlednaturalmineralwater);
		
		
	}

}
