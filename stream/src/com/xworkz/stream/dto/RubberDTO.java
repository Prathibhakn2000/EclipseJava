package com.xworkz.stream.dto;

import java.io.Serializable;

public class RubberDTO implements Serializable,Comparable<RubberDTO>{
	

	private String brand;
	private String color;
	private String shape;
	private Integer manfDate;
	
	public RubberDTO() {
		System.out.println("Running in no param const");
	}
	
	
	
	public RubberDTO(String brand, String color, String shape, Integer manfDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.shape = shape;
		this.manfDate = manfDate;
	}
	
	
    @Override
	public String toString() {
		return "RubberDTO [brand=" + brand + ", color=" + color + ", shape=" + shape + ", manfDate=" + manfDate
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	@Override
	public int compareTo(RubberDTO o) {
		System.out.println("Running in RubberDTO");
		return (o.brand.compareTo(this.brand));
	}



	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}



	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}



	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}



	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}



	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}



	/**
	 * @return the manfDate
	 */
	public Integer getManfDate() {
		return manfDate;
	}



	/**
	 * @param manfDate the manfDate to set
	 */
	public void setManfDate(Integer manfDate) {
		this.manfDate = manfDate;
	}

}
