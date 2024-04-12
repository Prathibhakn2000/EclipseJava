package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.Bangle;
import com.xworkz.functionalinterface.Bulb;
import com.xworkz.functionalinterface.Cow;
import com.xworkz.functionalinterface.Fan;
import com.xworkz.functionalinterface.Mirror;
import com.xworkz.functionalinterface.NewsPaper;
import com.xworkz.functionalinterface.PhotoFrame;
import com.xworkz.functionalinterface.Spoon;
import com.xworkz.functionalinterface.Watch;

public class Runner {

	public static void main(String[] args) {
		
		
		Watch watch=()->System.out.println("Running in watch"); //impl class/ lamda expression
	    
		watch.showTime(); //asso class
		
		
		Fan fan=(speed)->
		{
			System.out.println("Running in Fan");
			System.out.println(speed);
		};
		fan.givesAir(5);
		
		
		
		PhotoFrame photo=(size,prize)->{
			System.out.println("Running in PhotoFrame");
			System.out.println(size);
			System.out.println(prize);
		
		};
		photo.show(4.1,450);
		
		Mirror mirror =(p,len,shape)->
		{
			System.out.println("Running in Mirror");
			System.out.println(p);
			System.out.println(len);
			System.out.println(shape);
			
		};
		
		mirror.reflectivity(1000, 4.7, "rectangle");
		
		NewsPaper paper=()->{
			System.out.println("Running in NewsPaper");
			return true;
		};
		paper.read();
		
		
		Bulb bulb=()->
		{
			
			System.out.println("Running in Bulb");
			return 10;
		};
		bulb.brightness();
		
		Bangle bangle=()->
		{
		  System.out.println("Running in Bangle");	
		  return null;
		};
		bangle.style();
		
		
		Cow cow=(price)->
		{ 
		 System.out.println("Running in Cow");
	     return price > 10000 ? true : false ;
		};
		cow.isExpensive(100000);
		
		Spoon sp=(w,p)->
		{
			System.out.println("Running in Spoon");
			
			System.out.println(w);
			return w;
		};
		sp.eat(12, 34);
		

	}

}
