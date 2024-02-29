package com.xworkz.practice.example;

public class TrifficRunner {

	public static void main(String[] args) throws Exception {
		
			try {
			TrafficSignal signal=new TrafficSignal();
			System.out.println("before light");
			signal.colorLight("Green");
			System.out.println("Green light");
			}
			catch(SignslNotFound sn){
			System.err.println("handling exception :"+sn.getMessage());
			System.out.println(sn.getClass());
			System.out.println(sn.getStackTrace());
			}
			}
}

			

	


