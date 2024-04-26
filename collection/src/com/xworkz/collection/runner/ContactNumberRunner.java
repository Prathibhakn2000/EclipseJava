package com.xworkz.collection.runner;

import java.util.Collection;

import com.xworkz.collection.example.ContactNumber;

public class ContactNumberRunner {

	public static void main(String[] args) {
		
		Collection<Long> collection=ContactNumber.getContactNo();
		for(Long cn:collection)
		{
			System.out.println("ContactNo:"+cn);
		}

	}

}
