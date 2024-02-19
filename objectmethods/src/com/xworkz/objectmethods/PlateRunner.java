package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Plate;

public class PlateRunner {

	public static void main(String[] args) {
		
		Plate plate = new Plate();
		plate.color="black";
		plate.price=60;
		plate.shape="circle";
		
		Plate plate1 = new Plate();
		plate1.color="black";
		plate1.price=60;
		plate1.shape="circle";
		
		Plate plate2 = new Plate();
		plate2.color="yellow";
		plate2.price=60;
		plate2.shape="circle";
		
		Plate plate3 = new Plate();
		plate3.color="yellow";
		plate3.price=70;
		plate3.shape="circle";
		
		boolean ref = plate.equals(null);
		System.out.println(ref);
		
		boolean ref1 = plate.equals(plate1);
		System.out.println(ref1);
		
		boolean ref2 = plate.equals(plate2);
		System.out.println(ref2);
		
		boolean ref3 = plate2.equals(plate3);
		System.out.println(ref3);

	}

}
