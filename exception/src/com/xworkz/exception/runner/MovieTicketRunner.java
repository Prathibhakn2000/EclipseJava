package com.xworkz.exception.runner;

import com.xworkz.exception.MovieTicket;
import com.xworkz.exception.TicketException;

public class MovieTicketRunner {

	public static void main(String[] args) throws TicketException {
		
		try
		{
		MovieTicket ticket = new MovieTicket();
		System.out.println("before check");
		ticket.buyMovieTicket(900);
		System.out.println("after check");

	    }
	
		catch(Exception e)
		{
			System.err.println("handle the Exception:"+e.getMessage());
			System.err.println(e.getClass());
		}
		
		System.out.println("running Movieticket");

}
}
