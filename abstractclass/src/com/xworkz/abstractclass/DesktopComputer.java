package com.xworkz.abstractclass;

public class DesktopComputer extends Computer {

	public DesktopComputer(int price, String brand) {
		super(price, brand);
		
	}

	public DesktopComputer(String brand,int storage) {
		super(brand,storage);
		
	}

	@Override
	public void consumeElectricity() {
		System.out.println("consume some electricity in desktopcomputer");
		
	}

}
