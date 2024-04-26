package com.xworkz.collection.runner;

import java.util.Collection;

import com.xworkz.collection.example.PassBookNumber;

public class PassBokkRunner {

	public static void main(String[] args) {
		
		Collection<Long> collection=PassBookNumber.getPassBookNo();
		//int countStartWithFour=0;
		for(Long pb:collection)
		{
			String passbook=String.valueOf(pb);
			
			if(passbook.startsWith("4"))
			{
				System.out.println("pass book numbers starts with 4:"+passbook);
				
			}
			if(passbook.contains("0"))
			{
				System.out.println("whose numbers having '0':"+passbook);
			}
	
			
		}
		
 
	}

}
