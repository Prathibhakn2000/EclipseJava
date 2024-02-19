package com.xworkz.objectmethods;

import com.xworkz.objectmethods.equalto.Mug;

public class MugRunner {

	public static void main(String[] args) {
		
		Mug mug =new Mug();
		mug.material="plastic";
		mug.volume=1;
		mug.shape="Stright mug";

		Mug mug1 =new Mug();
		mug1.material="Ceramic";
		mug1.volume=2;
		mug1.shape="Stright mug";
		
		Mug mug2 =new Mug();
		mug2.material="Ceramic";
		mug2.volume=2;
		mug2.shape="Stright mug";

		Mug mug3 =new Mug();
		mug3.material="Ceramic";
		mug3.volume=2;
		mug3.shape="Stright mug";
		

		boolean ref = mug.equals(null);
		System.out.println(ref);
		
		boolean ref1 = mug.equals(mug1);
		System.out.println(ref1);
		
		boolean ref2 = mug.equals(mug2);
		System.out.println(ref2);
		
		boolean ref3 = mug2.equals(mug3);
		System.out.println(ref3);


	}

}
