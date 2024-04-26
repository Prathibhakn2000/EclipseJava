package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.example.Temperature;

public class TemparetureRunner {
	
	public static void main(String[] args)
	{
		Collection<Double> collection= Temperature.getTemparature();
		
		for(Double temp:collection)
		{
			if(temp>20)
				System.out.println("Temperature greater than 20 is: "+temp);
			
			
			if(temp<20)
				System.out.println("Temperature less than 20 is: "+temp);
			
		}
		
		
//		for(Double a:temp)
//		{
//			if(a>15)
//				temp.remove(a);
//		
//		}
//		Exception in thread "main" "java.util.ConcurrentModificationException" so use iterator method
				Iterator<Double> temp=collection.iterator();
				
		while(temp.hasNext())
		{
			Double a=temp.next();
			if(a<15)
			{
				temp.remove();
			}
			
		}
		System.out.println("size is: "+collection.size());
		}
	}


