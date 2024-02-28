package com.xworkz.exception.runner;

import com.xworkz.exception.TrainTicket;

public class TrainTicketRunner {

	public static void main(String[] args) {
		try
		{
		TrainTicket ticket = new TrainTicket();
		System.out.println("before check");
		ticket.getTicket(46734607);
		System.out.println("after check");
		
	    }
		catch(RuntimeException r)
		{
		   System.err.println("event is handdled:"+r.getMessage());	
		   System.out.println(r.getCause());
		   System.out.println(r.getClass());
		}
		
		System.out.println("running trainTicket");
	

}
}
