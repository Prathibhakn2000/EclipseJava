package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.BellDTO;

public class BellRunner {
	
  public static void main(String[] args) {
	
	  BellDTO bell=new BellDTO("Broze","TempleBell",3,4,5,3000);
	  BellDTO bell1=new BellDTO("Broze","TempleBell",3,4,3,2000);
	  BellDTO bell2=new BellDTO("copper","cycleBell",3,4,5,900);
	  BellDTO bell3=new BellDTO("Broze","TempleBell",5,4,5,3000);
	  BellDTO bell4=new BellDTO("Broze","HouseBell",3,4,5,3000);
	  BellDTO bell5=new BellDTO("tin","cycleBell",7,4,7,1000);
	  BellDTO bell6=new BellDTO("Broze","TempleBell",3,4,5,500);
	  BellDTO bell7=new BellDTO("Broze","cycleBell",6,4,5,3000);
	  BellDTO bell8=new BellDTO("copper","houseBell",3,4,5,2000);
	  BellDTO bell9=new BellDTO("copper","TempleBell",3,7,5,3000);
	  
	  Collection<BellDTO> collection=new ArrayList<BellDTO>();
	  collection.add(bell);
	  collection.add(bell1);
	  collection.add(bell2);
	  collection.add(bell3);
	  collection.add(bell4);
	  collection.add(bell5);
	  collection.add(bell6);
	  collection.add(bell7);
	  collection.add(bell8);
	  collection.add(bell9);
	  
	  for(BellDTO b:collection)
	  {
	  System.out.println(b);
	  if(b.getPrice()>1000)
	  {
		  System.out.println("Price greaterthan 1000:"+b);
	  }
	  }
	  System.out.println("____________________________________");
	  for(BellDTO b1:collection)
	  {
	  System.out.println(b1);
	  if(b1.getWeight()==b1.getHeight())
	  {
		  System.out.println("Equal Weight and Height:"+b1 );
	  }
	  }
	  System.out.println("____________________________________");
	  for(BellDTO b2:collection)
	  {
	  //System.out.println(b2);
	  if(b2.getMetalUsed().equals("Broze"))
	  {
		  System.out.println("Broze Metalused Bell are:"+b2 );
	  }
	  }
	  
	  
	  
}

}
