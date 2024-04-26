package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.example.Message;

public class MessageRunner {

	public static void main(String[] args) {
     
	Collection<String> collection=	Message.getMessage();
	Iterator<String>  itr=collection.iterator();
	
	System.out.println("messages before remove "+collection.size());
	
	//for(String m:collection)
	//{
	//	System.out.println(m);
	//	if(m.length()>30)
	//	{
	//		collection.remove(m);
	//	}
	//}
	
	
	while(itr.hasNext())
	{
		String msg =itr.next();
	
	if(msg.length()>30)
	{
		System.out.println("message length is greaterthan 30 " + msg);
		
		itr.remove();
		
		
	}
	System.out.println("messages after remove"+collection.size());
	
	
	
	}
	}

}
