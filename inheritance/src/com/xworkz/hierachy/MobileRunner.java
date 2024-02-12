package com.xworkz.hierachy;

import com.xworkz.hierachy.like.Apple;
import com.xworkz.hierachy.like.Connector;
import com.xworkz.hierachy.like.Mobile;
import com.xworkz.hierachy.like.Oppo;
import com.xworkz.hierachy.like.Samsung;
import com.xworkz.hierachy.like.Vivo;

public class MobileRunner {

	public static void main(String[] args) {
		
		 Connector connector = new Connector();
		 Mobile mobile = new Mobile();
		// mobile.consumeElectricity();
		 connector.send(mobile);
		 
		 Samsung samsung = new Samsung();
		 //samsung.calling();
		  // samsung.consumeElectricity();
		 connector.send(samsung);
		 
		 
		 
		 Oppo oppo = new Oppo();
		// oppo.consumeElectricity();
		// oppo.messaging();
		 connector.send(oppo);
		 
		 
		 Vivo vivo = new Vivo();
		 //vivo.consumeElectricity();
		// vivo.playMusic();
		 connector.send(vivo);
		 
		 
		 
		 Apple apple = new Apple();
		 //apple.consumeElectricity();
		 //apple.internetBrowsing();
		 connector.send(apple);
		 
		 
	}    
	
	
	

}
