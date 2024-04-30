package com.xworkz.stream.dto;

import java.io.Serializable;

public class DayDTO implements Serializable,Comparable<DayDTO>{
	
	
	private String name;
	private int order;
	
	public DayDTO() {
		
	}
	
	public DayDTO(String name, int order) {
		super();
		this.name = name;
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "DayDTO [name=" + name + ", order=" + order + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(DayDTO o) {
		System.out.println("Running in DayDTO");
		if(this.order==o.order)
		{
			return 0;
		}
		else if(this.order>o.order)
		{
		return 10;
		}
		else 
		{
		return -100;
	}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

}
