package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.ObjIntConsumercheck;

public class ObjIntConsumerRunner {

	public static void main(String[] args) {
		ObjIntConsumercheck oic=new ObjIntConsumercheck((t, value) -> {
			System.out.println("multiply of 2 nbrs:" +t*value);
		});
		oic.play();
	}

}
