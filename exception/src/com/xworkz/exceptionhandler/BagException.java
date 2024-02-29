package com.xworkz.exceptionhandler;

public class BagException extends Exception{

	private static final long serialVersionUID = 552685374775187183L;
	
	public BagException (String msg)
	{
		super(msg);
	}
	
	public BagException ( )
	{
		super();
	}
	

}
