package com.xworkz.animal;

import com.xworkz.animal.cow.Biscuit;
import com.xworkz.animal.cow.Location;
import com.xworkz.animal.cow.Monkey;
import com.xworkz.animal.cow.Tree;

public class Runner {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		tree.monkey = new Monkey();
		tree.location = new Location();
		
		tree.name = "neem tree";
		tree.location.area = "BTM";
	    tree.location.city = "bengaluru";

		tree.monkey.biscuit = new Biscuit();
		
		tree.monkey.age = 10;
		tree.monkey.type = "macaques";
		
		tree.monkey.biscuit.brand = "cadbury oreo";
		tree.monkey.biscuit.price = 15d;
		
		System.out.println(tree.name);
		System.out.println(tree.location.area);
		System.out.println(tree.location.city);
		System.out.println(tree.monkey.age);
		System.out.println(tree.monkey.type);
		System.out.println(tree.monkey.biscuit.brand);
		System.out.println(tree.monkey.biscuit.price);
		
		Tree tree1 = new Tree();
		System.out.println(tree1.name);
		
		tree1.name = "coconut";
		System.out.println(tree1.name);
		
		
		tree1.monkey = new Monkey();
		tree1.monkey.age = 20;
		System.out.println(tree1.monkey.age);
		
		
		tree1.location = new Location();
		tree1.location.city = "hoskote";
		System.out.println(tree1.location.city);  
		
		
		
		
		
	    
	    
	    
	    

	}

}
