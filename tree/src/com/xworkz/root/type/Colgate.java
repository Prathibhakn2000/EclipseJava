package com.xworkz.root.type;

public class Colgate {
	
	public int manufacturingYear=2022;
	public int price=40;
	public String flavor="salt";
	
	public void cleanTeeth()
	{
		System.out.println("running cleanTeeth in colgate"); 
		this.toString();
	}
	
	
	@Override
	public String toString() {
		System.out.println("running tostring in colgate");
		return "manufacturingYear:"+manufacturingYear+ " ,price:"+price+ "flavor:"+flavor;
	}

}
