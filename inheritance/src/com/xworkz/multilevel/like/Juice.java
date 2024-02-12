package com.xworkz.multilevel.like;

public class Juice {

	public void energy(NaturalResource natural)
	{
		natural.helpsMakeFood();
		
		if(natural instanceof Water)
		{
			Water water =(Water)natural;
			//water.helpsMakeFood();
			water.agriculturalUse();
		}
		
		if(natural instanceof MineralWater)
		{
			MineralWater mineralwater=(MineralWater)natural;
			//mineralwater.helpsMakeFood();
			//mineralwater.agriculturalUse();
			mineralwater.improveHeartHealth();
		}
		if(natural instanceof NaturalMineralWater)
		{
			NaturalMineralWater naturalmineralwater=(NaturalMineralWater)natural;
			//naturalmineralwater.helpsMakeFood();
			//naturalmineralwater.agriculturalUse();
			//naturalmineralwater.improveHeartHealth();
			naturalmineralwater.givesBeatifulSkin();
		}
		if(natural instanceof BottledNaturalMineralWater)
		{
			BottledNaturalMineralWater bottlednaturalmineralwater =(BottledNaturalMineralWater)natural;
			//bottlednaturalmineralwater.helpsMakeFood();
			//bottlednaturalmineralwater.agriculturalUse();
			//bottlednaturalmineralwater.givesBeatifulSkin();
			//bottlednaturalmineralwater.improveHeartHealth();
			bottlednaturalmineralwater.loweredTheLevelsOfBadCholesterol();
		}
		
	}
}
