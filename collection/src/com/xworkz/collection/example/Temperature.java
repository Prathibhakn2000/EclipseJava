package com.xworkz.collection.example;

import java.util.ArrayList;
import java.util.Collection;

public class Temperature {

	public static Collection<Double> getTemparature() {
		Collection<Double> tempcollection= new ArrayList<Double>();
		tempcollection.add(23d);
		tempcollection.add(28d);
		tempcollection.add(30d);
		tempcollection.add(33d);
		tempcollection.add(25d);
		tempcollection.add(12d);
		tempcollection.add(13d);
		tempcollection.add(26d);
		tempcollection.add(31d);
		tempcollection.add(14d);
		return tempcollection;
	}

}
