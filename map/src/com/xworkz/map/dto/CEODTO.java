package com.xworkz.map.dto;

import java.io.Serializable;
import java.util.Objects;

public class CEODTO implements Serializable,Comparable<CEODTO> {
	
	private String name;
	private Integer exp;
	private String nativePlace;
	private Integer salary;
	
	public CEODTO() {
		
	}
	
	

	public CEODTO(String name, Integer exp, String nativePlace, Integer salary) {
		super();
		this.name = name;
		this.exp = exp;
		this.nativePlace = nativePlace;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "CEODTO [name=" + name + ", exp=" + exp + ", nativePlace=" + nativePlace + ", salary=" + salary + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(exp, name, nativePlace, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CEODTO other = (CEODTO) obj;
		return Objects.equals(exp, other.exp) && Objects.equals(name, other.name)
				&& Objects.equals(nativePlace, other.nativePlace) && Objects.equals(salary, other.salary);
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
	 * @return the exp
	 */
	public Integer getExp() {
		return exp;
	}



	/**
	 * @param exp the exp to set
	 */
	public void setExp(Integer exp) {
		this.exp = exp;
	}



	/**
	 * @return the nativePlace
	 */
	public String getNativePlace() {
		return nativePlace;
	}



	/**
	 * @param nativePlace the nativePlace to set
	 */
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}



	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	@Override
	public int compareTo(CEODTO o) {
		
		return(this.name.compareTo(o.name));
	}
	
	

}
