package com.xworkz.stream.dto;

import java.io.Serializable;

public class BrushDTO implements Serializable,Comparable<BrushDTO>{

	private String brand;
    private Integer price;
    private String material;
    private String type;
    
    
    public BrushDTO() {
		System.out.println("Running in no para const");
	}


	public BrushDTO(String brand, Integer price, String material, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.type = type;
	}


	@Override
	public String toString() {
		return "Brush [brand=" + brand + ", price=" + price + ", material=" + material + ", type=" + type + "]";
	}
	
	

	@Override
	public int compareTo(BrushDTO o) {
		System.out.println("Running in brushDTO ");
		return(this.price.compareTo(o.price));
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
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}


	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}


	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


    
    
}
