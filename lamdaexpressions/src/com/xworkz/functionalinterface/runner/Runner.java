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
		
		System.out.println("______________________________________");
		
		PhotoFrame photo=(size,prize)->{
			System.out.println("Running in PhotoFrame");
			System.out.println(size);
			System.out.println(prize);
		
		};
		photo.show(4.1,450);
		System.out.println("______________________________________");
		
		Mirror mirror =(p,len,shape)->
		{
			System.out.println("Running in Mirror");
			System.out.println(p);
			System.out.println(len);
			System.out.println(shape);
			
		};
		
		mirror.reflectivity(1000, 4.7, "rectangle");
		System.out.println("______________________________________");
		
		NewsPaper paper=()->{
			System.out.println("Running in NewsPaper");
			return true;
		};
		boolean p= paper.read();
		System.out.println(p);
		System.out.println("______________________________________");
		
		
		Bulb bulb=()->
		{
			
			System.out.println("Running in Bulb");
			return 10;
		};
		int b=bulb.brightness();
		System.out.println(b);
		System.out.println("______________________________________");
		
		Bangle bangle=()->
		{
		  System.out.println("Running in Bangle");	
		  return "blue";
		};
		String ba=bangle.style();
		System.out.println(ba);
		System.out.println("______________________________________");
		
		Cow cow=(price)->
		{ 
		 System.out.println("Running in Cow");
	     return price > 10000 ? true : false ;
		};
		boolean price=cow.isExpensive(1000);
		System.out.println(price);
		System.out.println("______________________________________");
		
		Spoon sp=(w,pr)->w+pr; 
		{
			System.out.println("Running in Spoon");
			
		};
		Double spoon=sp.eat(12, 34);
		System.out.println(spoon);
		

	}

}
