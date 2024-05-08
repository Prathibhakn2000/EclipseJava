package com.xworkz.map;

import java.util.LinkedHashMap;
import java.util.Map;

import com.xworkz.map.dto.CEODTO;
import com.xworkz.map.dto.CompanyDTO;

public class CompanyRunner {

	public static void main(String[] args) {
		
		
		CompanyDTO c=new CompanyDTO("TCS",100,15/1/1978,"BTM");
		CompanyDTO c1=new CompanyDTO("Wipro",101,18/3/1990,"RajajiNagar");
		CompanyDTO c2=new CompanyDTO("TATA",102,13/5/1789,"Mejestic");
		CompanyDTO c3=new CompanyDTO("Oracle",103,12/9/1980,"Marthhalli");
		CompanyDTO c4=new CompanyDTO("IBM",104,29/5/1968,"SilkBoard");
		
		
		CEODTO ceo=new CEODTO("Prathibha",5,"Hoskote",100000);
		CEODTO ceo1=new CEODTO("Madhu",8,"BTM",100000);
		CEODTO ceo2=new CEODTO("Jyothi",5,"Krpuram",150000);
		CEODTO ceo3=new CEODTO("kavya",4,"Tinfactory",100000);
		CEODTO ceo4=new CEODTO("Pramod",10,"Hoskote",100000);
		
		Map<CompanyDTO, CEODTO> map=new LinkedHashMap<CompanyDTO, CEODTO>();
		map.put(c, ceo);
		map.put(c1, ceo1);
		map.put(c2, ceo2);
		map.put(c3, ceo3);
		map.put(c4, ceo4);
		map.put(c4, null);
		map.put(null, null);
		
		map.forEach((company,ceos)->System.out.println(company +" : "+ceos));
		


	}

}
