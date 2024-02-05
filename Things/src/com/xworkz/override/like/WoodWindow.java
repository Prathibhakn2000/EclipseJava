package com.xworkz.override.like;

public class WoodWindow extends Window{
    @Override
	public void open()
	{
		System.out.println("running open in woodwindow");
	}
	
    @Override
	public void close()
	{
		System.out.println("running close in woodwindow");
	}
	
	public void autoClose()
	{
		System.out.println("running autoClose in woodwindow");
	} 

}
