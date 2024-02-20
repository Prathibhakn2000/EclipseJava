package com.xworkz.getsetmethods.runner;

import com.xworkz.getsetmethods.NailPolish;

public class NailPolishRunner {

	public static void main(String[] args) {
		
		NailPolish nailpolish = new NailPolish();
		System.out.println(nailpolish);
		
        String value=nailpolish.getBrand();
        System.out.println(value);
        

        String value1=nailpolish.getColor();
        System.out.println(value1);
        

        int value2=nailpolish.getPrice();
        System.out.println(value2);
        

        int value3=nailpolish.getManifacturingYear();
        System.out.println(value3);
        
        nailpolish.setMadeIn("Hoskote");
        String value4=nailpolish.getMadeIn();
        System.out.println(value4);
        System.out.println(nailpolish);
        
        //nailpolish.setMadeIn("Hoskote");
        
       
	}

}
