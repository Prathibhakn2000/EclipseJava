package com.xworkz.collection.dto;

public class MarkerDTO {

	private String brand;
	private String color;
	private int price;
	private int size;
	
	
	public MarkerDTO() {
		System.out.println("Running in no param MarkerDTO");
	}


	public MarkerDTO(String brand, String color, int price, int size) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}


	@Override
	public String toString() {
		return "MarkerDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + "]";
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
