package com.xworkz.root;

import com.xworkz.root.type.SwitchBoard;

public class SwitchBoardRunner {

	public static void main(String[] args) {
		SwitchBoard switchBoard = new SwitchBoard();
		switchBoard.checkLoadStatus();
		System.out.println(switchBoard);
		System.out.println("hashCode:"+switchBoard.hashCode());
		switchBoard.noOfSwitch=6;
		switchBoard.powerSupply="current capacity";
		switchBoard.switchMood="off";
		System.out.println(switchBoard);
		System.out.println("hashCode:"+switchBoard.hashCode());
	}

}
