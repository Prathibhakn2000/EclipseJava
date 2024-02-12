package com.xworkz.root.type;

public class Table {
	public String material="wood";
	public int weight = 20;
	
	public void support()
	{
		System.out.println("running support in table");
		super.toString();
		
	}
	@Override
	public String toString() {
		System.out.println("running toString in table");
		return "material:"+material+ ", weight:"+weight;
	}

}
