package com.xworkz.root;

import com.xworkz.root.type.Colgate;

public class ColgateRunner {

	public static void main(String[] args) {
		
		Colgate colgate = new Colgate();
		colgate.cleanTeeth();
		System.out.println(colgate);
		System.out.println("hashCode:"+colgate.hashCode());
		colgate.flavor="charkol";
		colgate.manufacturingYear=2021;
		colgate.price=60;
		System.out.println(colgate);
		System.out.println("hashCode:"+colgate.hashCode());
	}

}
