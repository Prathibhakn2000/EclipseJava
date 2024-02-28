package com.xworkz.exception;

public class MovieTicket {
	
public void buyMovieTicket(int ticketNo) throws TicketException
{
	
	if(ticketNo >= 0 && ticketNo <= 5000)
	{
		System.out.println("movie ticketNo is valid");
	}
	else 
	{   
	    System.out.println("movie ticketNo is invalid");
		throw new TicketException("movie ticketNo unavalible");
		
	}
	
	
	
	
	
}
}


