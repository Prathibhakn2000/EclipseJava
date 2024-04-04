package com.xworkz.interfacemetro.assoc;

import com.xworkz.interfacemetro.ExamRules;

public class ExamBoard {
	
	private ExamRules examrules;
	
	public ExamBoard(ExamRules examrules) 
	{
		this.examrules=examrules;
		
	}
	
	public void getHallTicket()
	{
		if(examrules!=null)
		{
			if(examrules.hallTicket()==true)
			{
				System.out.println("getting HallTicket");
			}
			else
			{
				System.out.println("Not Getting HallTicket");
			 }
			boolean b = examrules.hallTicket();
			System.out.println(b);
		}
		System.out.println("-------------------------------------");
	}
			public void printInvigilatorName()
			{
				if(examrules!=null)
				{
					String Name1 = examrules.invigilator();
					System.out.println("Invigilator name is:"+Name1);
				}
				System.out.println("-------------------------------------");
			}
			
			public void examDuration()
			{
				if(examrules!=null)
				{
					double t = examrules.duration();
					System.out.println("exam duration is  :"+t+"hrs");
				}
				
			}
			
	}
	

