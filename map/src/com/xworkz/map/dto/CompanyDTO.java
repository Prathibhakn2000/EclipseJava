package com.xworkz.map.dto;

import java.io.Serializable;
import java.util.Objects;

public class CompanyDTO implements Serializable,Comparable<CompanyDTO>{
	
	private String name;
	private Integer gstNO;
	private Integer estDate;
	private String city;
	
	
	
	public CompanyDTO() {
		
	}
	

	public CompanyDTO(String name, Integer gstNO, Integer estDate, String city) {
		super();
		this.name = name;
		this.gstNO = gstNO;
		this.estDate = estDate;
		this.city = city;
	}


	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", gstNO=" + gstNO + ", estDate=" + estDate + ", city=" + city + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(city, estDate, gstNO, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		return Objects.equals(city, other.city) && Objects.equals(estDate, other.estDate)
				&& Objects.equals(gstNO, other.gstNO) && Objects.equals(name, other.name);
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
	 * @return the gstNO
	 */
	public Integer getGstNO() {
		return gstNO;
	}


	/**
	 * @param gstNO the gstNO to set
	 */
	public void setGstNO(Integer gstNO) {
		this.gstNO = gstNO;
	}


	/**
	 * @return the estDate
	 */
	public Integer getEstDate() {
		return estDate;
	}


	/**
	 * @param estDate the estDate to set
	 */
	public void setEstDate(Integer estDate) {
		this.estDate = estDate;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public int compareTo(CompanyDTO o) {
		return (this.gstNO.compareTo(o.gstNO));
	}
	

}
