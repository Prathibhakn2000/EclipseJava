package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.Festival;
import com.xworkz.functionalinterface.FestivalCheck;

public class FestivalRunner {

	public static void main(String[] args) {
		
		//Festival festival=(i,b)->true;   -----implementaion of functional interface using lamdaexpression //explict
		//FestivalCheck fest=new FestivalCheck(festival);
	    //fest.check();
		
		FestivalCheck fest1=new FestivalCheck((i,b)->true); //implicit
	    fest1.check();

	}

}
