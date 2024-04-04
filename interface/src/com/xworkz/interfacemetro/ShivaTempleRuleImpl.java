package com.xworkz.interfacemetro;

public class ShivaTempleRuleImpl implements TempleRule{

	@Override
	public double openTime() {
		System.out.println("Running in opentime");
		double ot= 6.00d;
		return ot;
	}

	@Override
	public double closeTime() {
		System.out.println("Running in closetime");
		double ct= 8.00d;
		return ct;
		
	}

	@Override
	public double specialEntry() {
		System.out.println("Running in specialEntry");
		double se= 400d;
		return se;
		
	}

}
