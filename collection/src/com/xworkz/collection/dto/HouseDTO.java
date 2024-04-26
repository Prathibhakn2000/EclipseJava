package com.xworkz.collection.dto;

public class HouseDTO {
	
	private String name;
	private int no;
	private int rooms;
	private String area;
	
	
	public HouseDTO() {
		System.out.println("no param const in HouseDTO");
	}

  @Override
	public String toString() {
		return "HouseDTO [name=" + name + ", no=" + no + ", rooms=" + rooms + ", area=" + area + "]";
	}

  public HouseDTO(String name, int no, int rooms, String area) {
		super();
		this.name = name;
		this.no = no;
		this.rooms = rooms;
		this.area = area;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public int getRooms() {
		return rooms;
	}


	public void setRooms(int rooms) {
		this.rooms = rooms;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}
	

}
