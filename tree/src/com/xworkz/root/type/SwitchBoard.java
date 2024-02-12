package com.xworkz.root.type;

public class SwitchBoard {
	public int noOfSwitch=3;
	public String powerSupply="voltage";
	public String switchMood="on";

	
	public void checkLoadStatus()
	{
		System.out.println("running checkLoadStatus in switchBoard");
		super.toString();
	}
	
	@Override
	public String toString() {
	 System.out.println("running toString in switchboard");
		return "noOfSwitch:" +noOfSwitch+  ", powerSupply:" +powerSupply+ ", switchMood:" +switchMood;
				
	}

}
