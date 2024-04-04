package com.xworkz.interfacemetro;

public class MejesticMetroRulesImpl implements MetroRules{

	@Override
	public int buyTicket() {
		System.out.println("ticket price");
		return 40;
	}

	@Override
	public boolean cleaniness() {
		System.out.println("is cleaniness");
		return true;
	}

	@Override
	public boolean excessLagguage() {
		System.out.println("has excessLagguage");
		return true;
	}

	@Override
	public String getLine() {
		System.out.println(("geting line"));
		return MetroRules.GREEN_LINE;
	}

}
