package com.xworkz.map.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class EmployeeDTO implements Serializable,Comparable<EmployeeDTO>{
	
	private String name;
	private String desgination;
	private Integer salary;
	
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(String name, String desgination, Integer salary) {
		super();
		this.name = name;
		this.desgination = desgination;
		this.salary = salary;
	}





	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", desgination=" + desgination + ", salary=" + salary + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(desgination, name, salary);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return Objects.equals(desgination, other.desgination) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
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
	 * @return the desgination
	 */
	public String getDesgination() {
		return desgination;
	}





	/**
	 * @param desgination the desgination to set
	 */
	public void setDesgination(String desgination) {
		this.desgination = desgination;
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
	public int compareTo(EmployeeDTO o) {
		return (this.name.compareTo(o.name));
	}

}
