package com.xworkz.interfacemetro;

public interface MetroRules {
	
	//constants
	String GREEN_LINE="green";
	String PURPLE_LINE="purple";
	String YELLOW_LINE="yellow";

	//abstract methods
	int buyTicket();
	boolean cleaniness();
	boolean excessLagguage();
	String getLine();
	
}
