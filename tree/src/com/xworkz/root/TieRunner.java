package com.xworkz.root;

import com.xworkz.root.type.Tie;

public class TieRunner {

	public static void main(String[] args) {
		
		Tie tie=new Tie();
		tie.design();
		tie.color="black";
		tie.length=2.3f;
		tie.material="rayon";
		System.out.println(tie);
		System.out.println("hashCode:"+tie.hashCode());
		tie.color="blue";
		tie.length=2.8f;
		tie.material="raymond";
		System.out.println(tie);
		System.out.println("hashCode:"+tie.hashCode());
	}

}
