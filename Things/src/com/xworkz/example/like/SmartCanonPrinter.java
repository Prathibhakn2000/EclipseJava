package com.xworkz.example.like;

public class SmartCanonPrinter extends CanonPrinter{
	
	@Override
	public void print()
	{
		System.out.println("running print in smartcanonprinter");
	}
	
	@Override
	public void scan()
	{
		System.out.println("running scan in smartcanonprinter");
	}
	
	@Override
	public void copy()
	{
		System.out.println("running copy in smartcanonprinter");
	}
	
	@Override
	public void connectToWifi()
	{
		System.out.println("running connectToWifi in smartcanonprinter");
	}
	
	public void connectToMobile()
	{
		System.out.println("running connecttomobile in smartcanonprinter");
	}
	
	
	

}
