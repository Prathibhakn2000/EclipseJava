package com.xworkz.collection.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Colors {

	public static void main(String[] args) {
		
		Collection<String> colorcollection= new ArrayList<String>();
		colorcollection.add("Pink");
		colorcollection.add("Red");
		colorcollection.add("Green");
		colorcollection.add("Orange");
		colorcollection.add("Blue");
		colorcollection.add("Black");
		colorcollection.add("White");
		colorcollection.add("Brown");
		colorcollection.add("Yellow");
		colorcollection.add("Purpule");
		
		
		System.out.println("Count of Colors:"+colorcollection.size());
		
		for(String clr:colorcollection)
		{
			System.out.println(clr);
		}
		
		System.out.println("--------------------------------------------");
		
		Collection<String> presidentcollection= new LinkedList<String>();
		presidentcollection.add("Droupadi Murmu");
		presidentcollection.add("Ram Nath Kovind");
		presidentcollection.add("Pranab Mukherjee");
		presidentcollection.add("Pratibha Devisingh Patil");
		presidentcollection.add("A.P.J.Abdul Kalam");
		
		System.out.println("Count of PresidentsName:"+presidentcollection.size());
		
		for(String presidents:presidentcollection)
		{
			System.out.println(presidents);
		}
		
        System.out.println("--------------------------------------------");
		
		Collection<String> addresscollection= new LinkedList<String>();
		addresscollection.add("Hoskote");
		addresscollection.add("KRPuram");
		addresscollection.add("TinFactory");
		addresscollection.add("BTM");
		addresscollection.add("Jayanagar");
		addresscollection.add("JPnagar");
		addresscollection.add("Mejestic");
		addresscollection.add("Vidyaranyapura");
		addresscollection.add("Yalahanka");
		addresscollection.add("Rajajinagar");
		
		System.out.println("Count of Address:"+addresscollection.size());
		
		for(String presidents:addresscollection)
		{
			System.out.println(presidents);
		}
	
		
	}

}
