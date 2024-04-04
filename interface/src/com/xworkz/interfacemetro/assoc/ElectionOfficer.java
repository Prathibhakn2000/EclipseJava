package com.xworkz.interfacemetro.assoc;

import com.xworkz.interfacemetro.ElectionRules;

public class ElectionOfficer {
	
	private ElectionRules electionrules;
	
	public ElectionOfficer(ElectionRules electionrules) 
	{
		this.electionrules=electionrules;
       
	}
	
	public void eligibleAge()
	{
		int a=electionrules.ageEligible();
	    System.out.println("age of voter is:"+a+" years");
	    
		if(electionrules!=null)
		{
			if(a>=18)
			{
				System.out.println("eleligible to vote");
			}
			else
			{
				System.err.println(" not eleligible to vote");
			}
		}
		System.out.println("-------------------------------------");
	}
		
		 public void voterVerifyIdCard()
		 {
			 if(electionrules!=null)
			 {
				 if(electionrules.verifyIdCard()==true)
				 {
					 System.out.println("Id card is Verified");
				 }
				 else 
				 {
					 System.out.println("Id Card not verified");
				 }
			 }
		 
		 System.out.println("-------------------------------------");
		 }
		 
		 public void voterVerifyOnePersonOneVote()
		 {
			 if(electionrules!=null)
			 {
				 if(electionrules.verifyOnePersonOneVote()==true)
				 {
					 System.out.println("Verified");
				 }
				 else 
				 {
					 System.out.println("not verified");
				 }
			 }
			 System.out.println("-------------------------------------");
		 }
		 
		 public void getElectionOfficerName()
		 {
			 if(electionrules!=null)
			 {
				String n =electionrules.electionOfficer();
				System.out.println("Election Officer NAme is:"+n);
		 }
			 System.out.println("-------------------------------------");
		 }
			 
			 public void startTimings()
			 {
				 if(electionrules!=null)
				 {
					float time =electionrules.startTime();
					System.out.println("Election Starting timings is:"+time+"am");
			 }
				 System.out.println("-------------------------------------");
			 }
				 
				 public void endTimings()
				 {
					 if(electionrules!=null)
					 {
						float time1 =electionrules.endTime();
						System.out.println("Election ending timings is:"+time1+"pm");
				 }
					 
	}
}

