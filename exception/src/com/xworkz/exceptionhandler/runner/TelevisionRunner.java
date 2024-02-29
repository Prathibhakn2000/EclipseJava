package com.xworkz.exceptionhandler.runner;


import com.xworkz.exceptionhandler.Television;
import com.xworkz.exceptionhandler.TelevisionException;

public class TelevisionRunner {

	public static void main(String[] args)  {
		
				Television tv = new Television();

				System.out.println("before check");
				try 
				{
				tv.buyTV(80000);
				System.out.println("after check");
				
				}
				
				catch(TelevisionException t)
				{
					System.err.println("handdled the event:"+ t.getMessage());
					
					System.out.println(t.getClass());
					
					StackTraceElement[] ste=t.getStackTrace();
					System.out.println(ste);
				}
				
				

			}

		

	}


