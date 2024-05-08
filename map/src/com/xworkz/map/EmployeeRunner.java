package com.xworkz.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.xworkz.map.dto.CompanyDTO;
import com.xworkz.map.dto.EmployeeDTO;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		CompanyDTO c=new CompanyDTO("TCS",100,1/8/1978,"BTM");
		CompanyDTO c1=new CompanyDTO("Wipro",101,15/12/1990,"RajajiNagar");
		CompanyDTO c2=new CompanyDTO("TATA",102,16/11/1789,"Mejestic");
		CompanyDTO c3=new CompanyDTO("Oracle",103,24/8/1980,"Marthhalli");
		CompanyDTO c4=new CompanyDTO("IBM",104,2/9/1968,"SilkBoard");
		
		
		EmployeeDTO e= new EmployeeDTO("Narun","SE",90000);
		EmployeeDTO e1= new EmployeeDTO("Avyan","SoftwareDeveloper",80000);
		EmployeeDTO e2= new EmployeeDTO("Abhi","SE",70000);
		EmployeeDTO e3= new EmployeeDTO("Dhanush","SE",60000);
		EmployeeDTO e4= new EmployeeDTO("Sanju","SoftwareDeveloper",90000);
		
		
		Set<EmployeeDTO> emps=new HashSet<EmployeeDTO>(Arrays.asList(e,e1,e2,e3,e4));
		
		Map<CompanyDTO,Set<EmployeeDTO>> com=new HashMap<CompanyDTO,Set<EmployeeDTO>>();
		com.put(c,emps );
		com.put(c1,emps );
		com.put(c2,emps );
		com.put(c3,emps );
		com.put(c4,emps );
		
		com.forEach((company,emp)->System.out.println(company +" : "+ emp));
		

	}

}
