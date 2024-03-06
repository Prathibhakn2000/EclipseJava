package com.xworkz.abstractclass.runner;


import com.xworkz.abstractclass.Computer;
import com.xworkz.abstractclass.DesktopComputer;

public class ComputerRunner {

	public static void main(String[] args) {
		
		DesktopComputer desk = new DesktopComputer(45000, "lenovo");
		
		Computer comp = new DesktopComputer("lenovo", 256);
		
		desk.consumeElectricity();

	}

}
