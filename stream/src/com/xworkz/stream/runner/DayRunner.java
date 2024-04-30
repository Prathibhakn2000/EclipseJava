package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.stream.dto.DayDTO;

public class DayRunner {

	public static void main(String[] args) {
		
		DayDTO day1= new DayDTO("Sunday",1);
		DayDTO day2= new DayDTO("Monday",2);
		DayDTO day4= new DayDTO("Wednesday",4);
		DayDTO day6= new DayDTO("Friday",6);
		DayDTO day3= new DayDTO("Tuesday",3);
		DayDTO day7= new DayDTO("Saturday",7);
		DayDTO day5= new DayDTO("Thrusday",5);
		
		Collection<DayDTO> collectionDay = new ArrayList<DayDTO>();
		collectionDay.add(day1);
		collectionDay.add(day2);
		collectionDay.add(day3);
		collectionDay.add(day7);
		collectionDay.add(day5);
		collectionDay.add(day6);
		collectionDay.add(day4);
		
		collectionDay
		.stream()
		.sorted()
		.forEach(d-> System.out.println(d));
		
		
		
		
		
	}

}
