package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.BiFunctionCheck;

public class BiFunctionRunner {

	public static void main(String[] args) {
		
		BiFunctionCheck  fun =new  BiFunctionCheck((String j,String i)->true);
		fun.read();
	}

}
