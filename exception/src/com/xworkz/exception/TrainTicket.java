package com.xworkz.exception;

public class TrainTicket {
	
	public void getTicket(int ticketNo)
	{
		if(ticketNo==46734607)
		{
			System.out.println("valid ticket number");
		}
		else if(ticketNo==4673)
		{
			System.out.println("invalid ticket number");
			throw new TrainTicketException("not found  ticket number");
		}
	}

}
