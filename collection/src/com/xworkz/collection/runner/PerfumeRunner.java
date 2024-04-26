package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.PerfumeDTO;

public class PerfumeRunner {

	public static void main(String[] args) {
		
		PerfumeDTO perfume=new PerfumeDTO("Armani","pink",2000,2024);
		PerfumeDTO perfume1=new PerfumeDTO("Armani","green",2000,2024);
		PerfumeDTO perfume2=new PerfumeDTO("Armani","pink",3000,2021);
		PerfumeDTO perfume3=new PerfumeDTO("DIOR","red",2000,2024);
		PerfumeDTO perfume4=new PerfumeDTO("Armani","pink",1000,2022);
		PerfumeDTO perfume5=new PerfumeDTO("Chanel","pink",2000,2024);
		PerfumeDTO perfume6=new PerfumeDTO("Armani","blur",4000,3020);
		PerfumeDTO perfume7=new PerfumeDTO("Armani","pink",2000,2024);
		PerfumeDTO perfume8=new PerfumeDTO("Rabanne","blue",5000,2024);
		PerfumeDTO perfume9=new PerfumeDTO("Armani","pink",3000,2024);
		
		Collection<PerfumeDTO> collection=new ArrayList<PerfumeDTO>();
		collection.add(perfume);
		collection.add(perfume1);
		collection.add(perfume2);
		collection.add(perfume3);
		collection.add(perfume4);
		collection.add(perfume5);
		collection.add(perfume6);
		collection.add(perfume7);
		collection.add(perfume8);
		collection.add(perfume9);
		
		Iterator<PerfumeDTO> itr=collection.iterator();
		while(itr.hasNext())
		{
			PerfumeDTO p=itr.next();
			if(p.getDurationLast()==2024)
			{
				System.out.println("before remove:"+collection.size());
				System.out.println("Perfume lastdate is 2024:"+p);
				itr.remove();
				System.out.println("after remove:"+collection.size());
			}
		}

	}

}
