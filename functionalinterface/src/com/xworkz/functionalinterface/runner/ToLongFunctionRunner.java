package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.ToLongFunctionCheck;

public class ToLongFunctionRunner {

	public static void main(String[] args) {
		
		
		ToLongFunctionCheck c=new ToLongFunctionCheck((f)->
		{
			System.out.println(f*2);
			return 123l;
		}
			
		);
         c.check();
	}

}

