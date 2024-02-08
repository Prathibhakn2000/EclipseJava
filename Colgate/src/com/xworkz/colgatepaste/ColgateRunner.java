package com.xworkz.colgatepaste;

import com.xworkz.colgatepaste.like.Colgate;
import com.xworkz.colgatepaste.like.ColgateCharcoal;
import com.xworkz.colgatepaste.like.ColgateStrongTeeth;
import com.xworkz.colgatepaste.like.Paste;

public class ColgateRunner {

	public static void main(String[] args) {
		
		Paste paste = new Paste();
		Colgate colgate1 =new Colgate();
		paste.clean(colgate1);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		ColgateStrongTeeth colgateStrongTeeth1 = new ColgateStrongTeeth();
		paste.clean(colgateStrongTeeth1);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		

		Colgate colgate2 = new ColgateStrongTeeth();
		paste.clean(colgate2);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		ColgateCharcoal colgateCharcoal1 = new ColgateCharcoal();
		paste.clean(colgateCharcoal1);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Colgate colgate3 = new ColgateCharcoal();
		paste.clean(colgate3);
		
		
		}

}
