package com.xworkz.exceptionhandler.runner;

import com.xworkz.exceptionhandler.Bag;
import com.xworkz.exceptionhandler.BagException;
import com.xworkz.exceptionhandler.MovieRatting;
import com.xworkz.exceptionhandler.RattingException;
import com.xworkz.exceptionhandler.Television;
import com.xworkz.exceptionhandler.TelevisionException;

public class BagRunner {

	public static void main(String[] args) throws RattingException, TelevisionException  {
		
		Bag bag = new Bag();
		MovieRatting ratting = new MovieRatting();
		Television tv= new Television();
		System.out.println("before bag check");
		try 
		{
			bag.buyBag(300);
			System.out.println("after bag check");
			
			System.out.println("before ratting check");
			
			MovieRatting.giveRatting("2 stars");
			
			System.out.println("after ratting check");
			
			System.out.println("before Tv check");
			tv.buyTV(40000);
			System.out.println("after tv check");
			
		} 
		catch (BagException | RattingException | TelevisionException temp) 
		{
            System.err.println("handdled event :"+temp.getMessage());
			
			System.out.println(temp.getClass());
			
			StackTraceElement[] ste=temp.getStackTrace();
			System.out.println(ste);
			
		}
		

	}

}
