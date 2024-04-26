package com.xworkz.collection.dto;

public class PerfumeDTO {
	
	private String brand;
	private String color;
	private int cost;
	private int durationLast;
	
	public PerfumeDTO() {
		System.out.println("Running in no param const");
	}

	public PerfumeDTO(String brand, String color, int cost, int durationLast) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.durationLast = durationLast;
	}

	@Override
	public String toString() {
		return "PerfumeDTO [brand=" + brand + ", color=" + color + ", cost=" + cost + ", durationLast=" + durationLast
				+ "]";
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
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the durationLast
	 */
	public int getDurationLast() {
		return durationLast;
	}

	/**
	 * @param durationLast the durationLast to set
	 */
	public void setDurationLast(int durationLast) {
		this.durationLast = durationLast;
	}
	
	
	

}
