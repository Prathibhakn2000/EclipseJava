package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.example.VoterIds;

public class VotersIdRunner {

	public static void main(String[] args) {
		Collection<Integer> collection=VoterIds.getVoterIds();
		Iterator<Integer> itr=collection.iterator();
		
		while(itr.hasNext())
		{
			Integer id =itr.next();
			
			if(id.equals(456378))
			{
				System.out.println("no of voterids before remove:"+collection.size());
				
				itr.remove();
				
				System.out.println("no of voterids after remove:"+collection.size());
				
			}
		}

	}

}
