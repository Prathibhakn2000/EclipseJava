package com.xworkz.excption.practice;

public class TankRunner {

	public static void main(String[] args) throws TankException {
		
		Tank ta = new Tank();
		try {
			System.out.println("before exception");
			ta.fill(8);
			System.out.println("after excection");
		    } 
		
		catch (ArithmeticException e)
		{
		 System.err.println("handdled exception");
			
			
		}
		
		
		finally
		
		{
		 System.out.println("Running in tank");
		}

}
}
