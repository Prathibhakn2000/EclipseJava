package com.xworkz.interfacemetro;

public class MLAElectionRulesImpl implements ElectionRules{

	@Override
	public int ageEligible() {
		System.out.println("Running in ageEligible");
		int age =23;
		return age;
	}

	@Override
	public boolean verifyIdCard() {
		System.out.println("Running in verifyIdCard");
		return true;
	}

	@Override
	public boolean verifyOnePersonOneVote() {
		System.out.println("Running in verifyOnePersonOneVote");
		return false;
	}

	@Override
	public String electionOfficer() {
		System.out.println("Running in electionOfficer");
		String name="pramod";
		return name;
	}

	@Override
	public float startTime() {
		System.out.println("Running in startTime ");
		float st = 7.00f;
		return st;
	}

	@Override
	public float endTime() {
		System.out.println("Running in endtTime ");
		float et = 7.00f;
		return et;
	}

}
