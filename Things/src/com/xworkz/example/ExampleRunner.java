package com.xworkz.example;

import com.xworkz.example.like.CanonPrinter;
import com.xworkz.example.like.Printer;
import com.xworkz.example.like.SmartCanonPrinter;

public class ExampleRunner {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.print();
		printer.scan();
		printer.copy();
		
		
		System.out.println("____________________________________________");
		
		Printer canonprinter = new CanonPrinter();
		canonprinter.print();
		canonprinter.scan();
		canonprinter.copy();
		
		
		
		CanonPrinter canonprinter1 = new CanonPrinter();
		canonprinter1.print();
		canonprinter1.scan();
		canonprinter1.copy();
		canonprinter1.connectToWifi();
		
		
        System.out.println("____________________________________________");
		
		Printer smart = new SmartCanonPrinter();
		smart.print();
		smart.scan();
		smart.copy();
		
		
		CanonPrinter smart1= new SmartCanonPrinter();
		smart1.print();
		smart1.scan();
		smart1.copy();
		smart1.connectToWifi();
		
		
		SmartCanonPrinter smart2= new SmartCanonPrinter();
		smart2.print();
		smart2.scan();
		smart2.copy();
		smart2.connectToWifi();
		smart2.connectToMobile();
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");	
		 
		//casting 
		
		CanonPrinter canonprinter3 =(CanonPrinter)canonprinter;
		canonprinter3.connectToWifi();
		
		SmartCanonPrinter print =(SmartCanonPrinter)smart;
		print.connectToWifi();
		print.connectToMobile();
		
		
		SmartCanonPrinter print1 =(SmartCanonPrinter)smart1;
		print1.connectToMobile();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
