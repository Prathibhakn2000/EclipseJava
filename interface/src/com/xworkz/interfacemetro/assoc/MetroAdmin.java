package com.xworkz.interfacemetro.assoc;

import com.xworkz.interfacemetro.MetroRules;

public class MetroAdmin {
	
	 private MetroRules metrorules;
	 
	 public MetroAdmin(MetroRules metrorules)
	 {
		this.metrorules = metrorules;
	 }
	 
	 public void cleaninessAndexcessLagguage()
	 {
		 if(metrorules!=null)
		 {
			 if(metrorules.cleaniness() && metrorules.excessLagguage() )
			 {
				 System.out.println("metro impl is good");
				 
			 }
			 
			 else 
			 {
				 System.out.println("metro impl is bad");
		      }
			 if(metrorules.buyTicket()>20)
			 {
				 System.out.println("ticket price is greater than 20");
			 }
			 else
			 {
				 System.out.println("ticket price is less than 20");
			 }
			 if(metrorules.getLine().equals("green"))
			 {
				 System.out.println("green line");
			 }
			 else
			 {
				 System.out.println("different line");
			 }
	 }
	 }
}


