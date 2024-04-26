package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.BoxDTO;

public class BoxRunner {

	public static void main(String[] args) {
		
		BoxDTO box=new BoxDTO(5,"red",110,"plastic");
		BoxDTO box1=new BoxDTO(6,"green",111,"plastic");
		BoxDTO box2=new BoxDTO(5,"red",112,"paper");
		BoxDTO box3=new BoxDTO(5,"green",113,"plastic");
		BoxDTO box4=new BoxDTO(5,"black",114,"plastic");
		BoxDTO box5=new BoxDTO(5,"red",115,"plastic");
		BoxDTO box6=new BoxDTO(5,"brown",116,"paper");
		BoxDTO box7=new BoxDTO(5,"red",117,"plastic");
		BoxDTO box8=new BoxDTO(5,"green",118,"plastic");
		BoxDTO box9=new BoxDTO(5,"red",119,"plastic");
		
		Collection<BoxDTO> collection= new ArrayList<BoxDTO>();
		collection.add(box);
		collection.add(box1);
		collection.add(box2);
		collection.add(box3);
		collection.add(box4);
		collection.add(box5);
		collection.add(box6);
		collection.add(box7);
		collection.add(box8);
		collection.add(box9);
		
		
		
        for(BoxDTO b:collection)
        {
        	System.out.println(b);
        	if(b.getColor().equals("red"))
        	{
        		System.out.println("Box color is Red:"+b);
        	}
        }
        System.out.println("______________________________________");
        Iterator<BoxDTO>  itr=collection.iterator();
        System.out.println("Before remove:"+collection.size());
        while(itr.hasNext())
    	{
    		BoxDTO clr =itr.next();
    		
    		if(clr.getColor().equals("green"))
    		{
    			System.out.println("remove Box color is green:"+clr);
    			itr.remove();
    			System.out.println("After remove:"+collection.size());
    		}
    	}
	}

}
