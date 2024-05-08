package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.map.dto.DegreeDTO;

public class DegreeDetailsRunner {

	public static void main(String[] args) {
		
		DegreeDTO degree=new DegreeDTO("Bsc","Cs",90,2021);
		DegreeDTO degree1=new DegreeDTO("Msc","Maths",80,2023);
		DegreeDTO degree2=new DegreeDTO("BE","EC",70,2019);
		DegreeDTO degree3=new DegreeDTO("Mcom","finance",66,2022);
		DegreeDTO degree4=new DegreeDTO("MBA","Marketing",80,2020);
		
		Map<String , DegreeDTO> d=new HashMap<String, DegreeDTO>();
		d.put("Prathibha", degree);
		d.put("Pramod", degree1);
		d.put("Jyothi", degree2);
		d.put("Kavya", degree3);
		d.put("Narun", degree4);
		d.put("null", degree4);
		d.put("null", null);
		//d.put("Narun", null);
		
		
		d.forEach((name,degrees)->System.out.println(name +" :"+degrees));
		
		
		
	}

}
