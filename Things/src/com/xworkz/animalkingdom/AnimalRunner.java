package com.xworkz.animalkingdom;

import com.xworkz.animalkingdom.like.AnimalKingdom;
import com.xworkz.animalkingdom.like.Bird;
import com.xworkz.animalkingdom.like.Parrot;

public class AnimalRunner {

	public static void main(String[] args) {
		
		AnimalKingdom animal = new AnimalKingdom();
		animal.eat();
		animal.sleep();
		animal.walk();
		
	System.out.println("___________________________________");
	
	    AnimalKingdom bird = new Bird();
	    bird.eat();
	    bird.sleep();
	    bird.walk();
	    
	    Bird bird1 = new Bird();
	    bird1.eat();
	    bird1.sleep();
	    bird1.walk();
	    bird1.fly();
	    bird1.makeSound();

	System.out.println("___________________________________");
	
	    AnimalKingdom parrot = new Parrot();
	    parrot.eat();
	    parrot.sleep();
	    parrot.walk();
	    
	    
	    Bird parrot1 = new Parrot();
	    parrot1.eat();
	    parrot1.sleep();
	    parrot1.walk();
	    parrot1.fly();
	    parrot1.makeSound();
	   
	    
	    Parrot parrot2 = new Parrot();
	    parrot2.eat();
	    parrot2.sleep();
	    parrot2.walk();
	    parrot2.fly();
	    parrot2.makeSound();
	    parrot2.talk();
	    parrot2.parrotAstrology();
	    
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	
	  //casting
	
	  Bird bird2 =(Bird)bird;
	  bird2.fly();
	  bird2.makeSound();
	
	  Parrot parrot3 =(Parrot)parrot;
	  parrot3.fly();
	  parrot3.makeSound();
	  parrot3.talk();
	  parrot3.parrotAstrology();
	  
	  
	  Parrot parrot4 =(Parrot)parrot1;
	  
	  parrot4.talk();
	  parrot4.parrotAstrology();
	  
	    
	   }

}


