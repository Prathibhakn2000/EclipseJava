package com.xworkz.root.type;

public class Battery {
	public String brandname="exide";
	public double capacity=344.4d;
	public String color="black";
	
	public void getcharge()
	{
		System.out.println("running getcharge in battery");
		this.toString();
	}

	@Override
	public String toString() {
		System.out.println("running tostring in battery");
		return "Brandname:" +brandname+ " ,capacity:" +capacity+ ", Color:" +color;
	}
}
