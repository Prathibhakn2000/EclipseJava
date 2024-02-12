package com.xworkz.root;

import com.xworkz.root.type.Battery;

public class BatteryRunner {

	public static void main(String[] args) {
		
		Battery battery = new Battery();
		battery.getcharge();
		System.out.println(battery);
		System.out.println("hashCode:"+battery.hashCode());
		battery.brandname="Amaron";
		battery.capacity=67.9d;
		battery.color="white";
		System.out.println(battery);
		System.out.println("hashCode:"+battery.hashCode());
		
	}

}
