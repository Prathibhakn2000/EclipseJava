package com.xworkz.collection.dto;

public class BellDTO {
	
	private String metalUsed;
	private String type;
	private double weight;
	private double width;
	private double height;
	private int price;
	
	public BellDTO() {
		System.out.println("no param const in BellDTO");
	}

	public BellDTO(String metalUsed, String type, double weight, double width, double height, int price) {
		super();
		this.metalUsed = metalUsed;
		this.type = type;
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BellDTO [metalUsed=" + metalUsed + ", type=" + type + ", weight=" + weight + ", width=" + width
				+ ", height=" + height + ", price=" + price + "]";
	}

	/**
	 * @return the metalUsed
	 */
	public String getMetalUsed() {
		return metalUsed;
	}

	/**
	 * @param metalUsed the metalUsed to set
	 */
	public void setMetalUsed(String metalUsed) {
		this.metalUsed = metalUsed;
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

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
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
	
	

}
