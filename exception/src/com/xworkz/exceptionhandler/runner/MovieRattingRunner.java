package com.xworkz.exceptionhandler.runner;

import com.xworkz.exceptionhandler.MovieRatting;
import com.xworkz.exceptionhandler.RattingException;
import com.xworkz.exceptionhandler.Television;
import com.xworkz.exceptionhandler.TelevisionException;



public class MovieRattingRunner {

	public static void main(String[] args) throws TelevisionException   {
		
		MovieRatting ratting = new MovieRatting();
		Television tv= new Television();
		
		System.out.println("Before ratting check");
		try
		{
		MovieRatting.giveRatting("2 stars");
		System.out.println("After ratting check");
		
		System.out.println("before tv check");
		tv.buyTV(80000);
		System.out.println("After tv check");
		
		}
		
		
		catch(RattingException r)
		{
			
			System.err.println("handdled event in 2 star rate:"+r.getMessage());
			
			System.out.println(r.getClass());
			
			StackTraceElement[] ste=r.getStackTrace();
			System.out.println(ste);
			
		}
		catch(TelevisionException t)
		{
			System.err.println("handdled the event:"+ t.getMessage());
			
			System.out.println(t.getClass());
			
			StackTraceElement[] ste=t.getStackTrace();
			System.out.println(ste);
		}
		
		
		

	}

}
