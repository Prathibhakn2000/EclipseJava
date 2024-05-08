package com.xworkz.map.dto;

import java.io.Serializable;
import java.util.Objects;

public class DegreeDTO implements Serializable,Comparable<DegreeDTO> {
	
	
	private String name;
	private String stream;
	private Integer percentage;
	private Integer yop;
	
	
	public DegreeDTO() {
		System.out.println("Running DegreeDTO no param const");
	}
	
	

	public DegreeDTO(String name, String stream, Integer percentage, Integer yop) {
		super();
		this.name = name;
		this.stream = stream;
		this.percentage = percentage;
		this.yop = yop;
	}



	@Override
	public String toString() {
		return "DegreeDTO [name=" + name + ", stream=" + stream + ", percentage=" + percentage + ", yop=" + yop + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(name, percentage, stream, yop);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DegreeDTO other = (DegreeDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(percentage, other.percentage)
				&& Objects.equals(stream, other.stream) && Objects.equals(yop, other.yop);
	}



	@Override
	public int compareTo(DegreeDTO o) {
		
		return (this.name.compareTo(o.name));
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
	 * @return the stream
	 */
	public String getStream() {
		return stream;
	}



	/**
	 * @param stream the stream to set
	 */
	public void setStream(String stream) {
		this.stream = stream;
	}



	/**
	 * @return the percentage
	 */
	public Integer getPercentage() {
		return percentage;
	}



	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}



	/**
	 * @return the yop
	 */
	public Integer getYop() {
		return yop;
	}



	/**
	 * @param yop the yop to set
	 */
	public void setYop(Integer yop) {
		this.yop = yop;
	}
	
	

}
