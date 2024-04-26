package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.HouseDTO;

public class HouseRunner {

	public static void main(String[] args) {
		
		HouseDTO house = new HouseDTO("Anugraha",5467,3,"BTM");
		HouseDTO house1 = new HouseDTO("maathruNilaya",7896,3,"Hoskote");
		HouseDTO house2 = new HouseDTO("VinayakaNilaya",4532,2,"mysore");
		HouseDTO house3 = new HouseDTO("VeekyPark",3245,2,"Mlore");
		HouseDTO house4 = new HouseDTO("AnapurneshwariNilaya",7645,3,"SilkBoard");
		HouseDTO house5 = new HouseDTO("TaagiMadilu",4325,3,"Blore");
		HouseDTO house6 = new HouseDTO("Anugraha",9867,4,"Vidyaranyapura");
		HouseDTO house7 = new HouseDTO("KrupaNilaya",4536,3,"Yalahanka");
		HouseDTO house8 = new HouseDTO("ParishramaNilaya",7865,4,"Sulibele");
		HouseDTO house9 = new HouseDTO("ShramaNilaya",9864,3,"SilkBoard");
		
		Collection<HouseDTO> collection=new ArrayList<HouseDTO>();
		collection.add(house);
		collection.add(house1);
		collection.add(house2);
		collection.add(house3);
		collection.add(house4);
		collection.add(house5);
		collection.add(house6);
		collection.add(house7);
		collection.add(house8);
		collection.add(house9);
		
		for(HouseDTO h:collection)
		{
			System.out.println(h);
		}
	}

}
