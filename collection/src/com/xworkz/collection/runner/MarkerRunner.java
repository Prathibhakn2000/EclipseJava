package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.BoxDTO;
import com.xworkz.collection.dto.MarkerDTO;
import com.xworkz.collection.dto.PerfumeDTO;

public class MarkerRunner {

	public static void main(String[] args) {
		
		MarkerDTO marker= new MarkerDTO("Copic","green",40,5);
		MarkerDTO marker1= new MarkerDTO("Sharpie","green",50,6);
		MarkerDTO marker2= new MarkerDTO("Copic","blue",60,5);
		MarkerDTO marker3= new MarkerDTO("staedtler","green",40,6);
		MarkerDTO marker4= new MarkerDTO("Posca","orange",40,5);
		MarkerDTO marker5= new MarkerDTO("sakura","black",80,3);
		MarkerDTO marker6= new MarkerDTO("Copic","green",30,5);
		MarkerDTO marker7= new MarkerDTO("Tombow","yellow",40,7);
		MarkerDTO marker8= new MarkerDTO("Copic","green",20,9);
		MarkerDTO marker9= new MarkerDTO("edding","orange",40,8);
		
		Collection<MarkerDTO> collection=new ArrayList<MarkerDTO>();
		collection.add(marker);
		collection.add(marker1);
		collection.add(marker2);
		collection.add(marker3);
		collection.add(marker4);
		collection.add(marker5);
		collection.add(marker6);
		collection.add(marker7);
		collection.add(marker8);
		collection.add(marker9);
		
		 for(MarkerDTO m1:collection)
	        {
	        	System.out.println(m1);
	        }
		Iterator<MarkerDTO> itr=collection.iterator();
		while(itr.hasNext())
		{
			MarkerDTO m=itr.next();
			if(m.getColor().equals("green"))
			{
				System.out.println("before remove:"+collection.size());
				System.out.println("Remove marker color is green"+m);
				itr.remove();
				System.out.println("after remove:"+collection.size());
			}
		}
	}

}
