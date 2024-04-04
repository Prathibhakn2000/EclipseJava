package com.xworkz.interfacemetro;

public class PucExamRulesImpl implements ExamRules{

	@Override
	public boolean hallTicket() {
		System.out.println("Running in hallTicket ");
		return false;
	}

	@Override
	public String invigilator() {
		System.out.println("Running in invigilator");
		String name="Prakash";
		return name;
	}

	@Override
	public double duration() {
		System.out.println("Running in duration");
		double time =3.15;
		return time;
	}
}

