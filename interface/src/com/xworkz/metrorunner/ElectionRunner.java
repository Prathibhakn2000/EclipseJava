package com.xworkz.metrorunner;

import com.xworkz.interfacemetro.ElectionRules;
import com.xworkz.interfacemetro.MLAElectionRulesImpl;
import com.xworkz.interfacemetro.assoc.ElectionOfficer;

public class ElectionRunner {

	public static void main(String[] args) {
		
		ElectionRules rule = new MLAElectionRulesImpl();
		
		ElectionOfficer off = new ElectionOfficer(rule);
		off.eligibleAge();
		off.voterVerifyIdCard();
		off.voterVerifyOnePersonOneVote();
		off.getElectionOfficerName();
		off.startTimings();
		off.endTimings();
		

	}

}
