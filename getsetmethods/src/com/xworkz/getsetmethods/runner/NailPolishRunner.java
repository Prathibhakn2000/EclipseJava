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
        
        NailPolish nailpolish1 = new NailPolish();
		System.out.println(nailpolish1);
		
        String val=nailpolish1.getBrand();
        System.out.println(val);
        

        String val1=nailpolish1.getColor();
        System.out.println(val1);
        

        int val2=nailpolish1.getPrice();
        System.out.println(val2);
        

        int val3=nailpolish1.getManifacturingYear();
        System.out.println(val3);
        
        nailpolish1.setMadeIn("Hoskote");
        String val4=nailpolish1.getMadeIn();
        System.out.println(val4);
        System.out.println(nailpolish1);
        
        boolean ref=nailpolish.equals(nailpolish1);
		System.out.println(ref);
        
        
        
        
       
	}

}
