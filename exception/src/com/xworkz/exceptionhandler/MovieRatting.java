package com.xworkz.exceptionhandler;

public class MovieRatting {
	
	public static void giveRatting(String rattings) throws RattingException
	{
		if(rattings.equals("5 stars"))
		{
			System.out.println("very good");
		}
		else if(rattings.equals("4 stars"))
		{
			System.out.println("good");
		}
		 else if(rattings.equals("3 stars"))
		{
			System.out.println("average");
			
		}
		 else if(rattings.equals("2 stars"))	
		{
			System.out.println("poor");
			throw new RattingException("poor rattings");
		}
	}
}


