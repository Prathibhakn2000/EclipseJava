package com.xworkz.example.like;

public class CanonPrinter extends Printer{
	
	
	@Override
	public void print()
	{
		System.out.println("running print in canonprinter");
	}
	
	@Override
	public void scan()
	{
		System.out.println("running scan in canonprinter");
	}
	
	@Override
	public void copy()
	{
		System.out.println("running copy in canonprinter");
	}
	
	public void connectToWifi()
	{
		System.out.println("running connectToWifi in canonprinter");
	}
	
	

}
