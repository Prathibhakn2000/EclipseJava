package com.xworkz.exceptionhandler;

public class RattingException extends Exception{

	private static final long serialVersionUID = 6608017670981733652L;
	
	public RattingException(String msg)
	{
		super(msg);
	}
	
	public RattingException()
	{
		super();
	}

}
