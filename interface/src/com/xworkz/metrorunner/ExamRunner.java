package com.xworkz.metrorunner;

import com.xworkz.interfacemetro.ExamRules;
import com.xworkz.interfacemetro.PucExamRulesImpl;
import com.xworkz.interfacemetro.assoc.ExamBoard;

public class ExamRunner {

	public static void main(String[] args) {
		ExamRules exam = new PucExamRulesImpl();
		
		ExamBoard board = new ExamBoard(exam);
		
		board.getHallTicket();
		board.printInvigilatorName();
		board.examDuration();

	}

}
