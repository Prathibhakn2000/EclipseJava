package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.stream.dto.BrushDTO;

public class BrushRunner {

	public static void main(String[] args) {
		
		BrushDTO brush=new BrushDTO("Colgate", 20,"Plastic","Manual Toothbrush");
		BrushDTO brush1=new BrushDTO("Sensodyne", 30,"nylon","Interdental Toothbrush");
		BrushDTO brush2=new BrushDTO("Rusabl", 50,"rubber","Manual Toothbrush");
		BrushDTO brush3=new BrushDTO("oral B", 80,"nylon","Toothbrush");
		BrushDTO brush4=new BrushDTO("caresmith", 200,"Plastic","Manual Toothbrush");
		BrushDTO brush5=new BrushDTO("pepsodent", 230,"rubber","Interdental Toothbrush");
		BrushDTO brush6=new BrushDTO("close-up", 28,"nylon","Manual Toothbrush");
		BrushDTO brush7=new BrushDTO("terrabrush", 50,"Plastic","Interdental Toothbrush");
		BrushDTO brush8=new BrushDTO("Colgate", 40,"rubber","Manual Toothbrush");
		BrushDTO brush9=new BrushDTO("oral B", 90,"Plastic","Toothbrush");

        Collection<BrushDTO> brushCollection=new ArrayList();
        brushCollection.add(brush);
        brushCollection.add(brush1);
        brushCollection.add(brush2);
        brushCollection.add(brush3);
        brushCollection.add(brush4);
        brushCollection.add(brush5);
        brushCollection.add(brush6);
        brushCollection.add(brush7);
        brushCollection.add(brush8);
        brushCollection.add(brush9);
        
       System.out.println("sorting price in asscending order"); 
        brushCollection
        .stream()
        .sorted()
        .forEach(b->System.out.println(b));
        
        System.out.println("-------------------------------------------");
        System.out.println("Printing price greaterthan 50");
        brushCollection
        .stream()
        //.sorted()
        .filter(br->br.getPrice()>50)
        .forEach(b->System.out.println(b));

	}
	
	

}
