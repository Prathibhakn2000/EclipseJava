package com.xworkz.collection.dto;

public class BoxDTO {
	
	private int area;
	private String color;
	private int serialNo;
	private String material;
	
	public BoxDTO() {
		System.out.println("Running no param const");
	}

	public BoxDTO(int area, String color, int serialNo, String material) {
		super();
		this.area = area;
		this.color = color;
		this.serialNo = serialNo;
		this.material = material;
	}

	@Override
	public String toString() {
		return "BoxDTO [area=" + area + ", color=" + color + ", serialNo=" + serialNo + ", material=" + material + "]";
	}

	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
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
	 * @return the serialNo
	 */
	public int getSerialNo() {
		return serialNo;
	}

	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
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
	
	

}
