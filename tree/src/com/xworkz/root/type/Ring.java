package com.xworkz.root.type;

public class Ring {
	
	public String type;  //properties
	public int price;
	public float weight;
	
	
	public boolean design()                 
	{ 
		System.out.println("running design in ring");
		//two type to invoke toString method 
		//super.toString();  //parent class method
	  String ref= super.toString();
	  System.out.println(ref); // print FQN @hexadecimal number(com.xworkz.root.type.Ring@15db9742)
		//this.toString(); //same class method
		return true;
		
		
	}
	
	
	@Override
	public String toString() {
		System.out.println("running tostring in ring");
		return "Type:"+type+ ", Price:"+price+ ", Weight:"+weight;
	}

}
