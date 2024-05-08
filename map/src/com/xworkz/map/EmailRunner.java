package com.xworkz.map;

import java.util.Map;
import java.util.TreeMap;

public class EmailRunner {
	
	public static void main(String[] args) {
		
		Map<String, String> map= new TreeMap<String, String>();
		map.put("prathibhakn2000@gmail.com", "Prathibha");
		map.put("pramod99@gmail.com", "Pramod");
		map.put("kavya978@gmail.com", "Kavya");
		map.put("jyothi675@gmail.com", "Jyothi");
		map.put("sanjitha2009@gmail.com", "Sanjitha");
		map.put("narun32@gmail.com", "Narun");
		map.put("veena2002@gmail.com", "Veena");
		map.put("kavitha88@gmail.com", "Kavitha");
		map.put("pruthvi123@gmail.com", "Pruthvi");
		map.put("sangeetha234@gmail.com", "Sangeetha");
		map.put("prathibhakn2000@gmail.com", "Prathibha");
		
	    map.forEach((email,name)->System.out.println(email  +" :   "+name));
	}

}
