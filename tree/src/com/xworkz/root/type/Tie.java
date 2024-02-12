package com.xworkz.root.type;

public class Tie {
  public String material;
  public String color;
  public float length;
  
  public void design()
  {
	  System.out.println("running design in tie");
	  super.toString();
  }
  
  @Override
	public String toString() {
	  System.out.println("running tostring in tie");
		return "material:" +material+ ", color:" +color+ ", length:" +length;
	}
}
