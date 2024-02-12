package com.xworkz.hierachy.like;

public class Connector {
	
	public void send(Mobile mobile)
	{
	 mobile.consumeElectricity();
	 
	 if(mobile instanceof Samsung)
	 {
		 Samsung samsung = (Samsung)mobile;
		 samsung.calling();
	 }
	 
	 if(mobile instanceof Oppo)
	 {
		 Oppo oppo = (Oppo)mobile;
		 oppo.messaging();
	 }
	 if(mobile instanceof Vivo)
	 {
		 Vivo vivo = (Vivo)mobile;
		 vivo.playMusic();
	 }
	 if(mobile instanceof Apple)
	 {
		 Apple apple = (Apple)mobile;
		 apple.internetBrowsing();
	 }
	}

}
