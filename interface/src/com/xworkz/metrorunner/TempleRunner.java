package com.xworkz.metrorunner;

import com.xworkz.interfacemetro.ShivaTempleRuleImpl;
import com.xworkz.interfacemetro.TempleRule;
import com.xworkz.interfacemetro.assoc.TempleCommity;

public class TempleRunner {

	public static void main(String[] args) {
		
		TempleRule tmpl = new ShivaTempleRuleImpl();
		
		
		TempleCommity commity = new TempleCommity(tmpl);
		commity.openTimings();
		commity.closeTimings();
		commity.costOfSpecialEntry();
	}

}
