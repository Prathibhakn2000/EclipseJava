package com.xworkz.root;

import com.xworkz.root.type.Table;

public class TableRunner {

	public static void main(String[] args) {
		Table table = new Table();
		table.support();
		System.out.println(table);
		System.out.println("hashCode:"+table.hashCode());
	    table.material="plastic";
	    table.weight=30;
	    System.out.println(table);
		System.out.println("hashCode:"+table.hashCode());
	    
	}

}
