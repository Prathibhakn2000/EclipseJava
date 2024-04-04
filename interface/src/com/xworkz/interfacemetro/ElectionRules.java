package com.xworkz.interfacemetro;

public interface ElectionRules {
	
	int ageEligible();
	boolean verifyIdCard();
	boolean verifyOnePersonOneVote();
	String electionOfficer();
	float startTime();
	float endTime();
	
	

}
