package com.xworkz.stream.runner;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.stream.dto.RubberDTO;

public class RubberRunner {

	public static void main(String[] args) {
		
		RubberDTO rubber = new RubberDTO("Alliance Rubber","Black","round",20-02);
		RubberDTO rubber1 = new RubberDTO("Dunlop Rubber","Blue","round",10-03);
		RubberDTO rubber2 = new RubberDTO("Century Rubber","White","round",12-02);
		RubberDTO rubber3 = new RubberDTO("National Rubber crop","Blue","round",07-05);
		RubberDTO rubber4 = new RubberDTO("Hankook Rubber","red","round",06-01);
		
		Collection<RubberDTO> collectionRubber = new LinkedList<RubberDTO>();
		collectionRubber.add(rubber); 
		collectionRubber.add(rubber1); 
		collectionRubber.add(rubber2); 
		collectionRubber.add(rubber3); 
		collectionRubber.add(rubber4); 
		
		System.out.println("sorting brand name in decending order");
		collectionRubber
		.stream()
		.sorted()
		.forEach(r->System.out.println(r));
		
		System.out.println("--------------------------------------");
		System.out.println("printing color blue");
		collectionRubber
		.stream()
		.filter(r->r.getColor().equals("Blue"))
		.forEach(r->System.out.println(r));
		
		
		
		
	}
}
