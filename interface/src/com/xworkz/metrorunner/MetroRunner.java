package com.xworkz.metrorunner;

import com.xworkz.interfacemetro.MejesticMetroRulesImpl;
import com.xworkz.interfacemetro.MetroRules;
import com.xworkz.interfacemetro.assoc.MetroAdmin;

public class MetroRunner {

	public static void main(String[] args) {
		
		MetroRules metro = new MejesticMetroRulesImpl();
		
		
		//MejesticMetroRulesImpl m =new MejesticMetroRulesImpl();
		
		//Object o =new MejesticMetroRulesImpl();
		
		MetroAdmin admin = new MetroAdmin(metro);
		admin.cleaninessAndexcessLagguage();
		
	}

}
