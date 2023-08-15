package com.rhythumitra.client;

public class Vegetable {
	private Integer id;
	private String name;
	private double price;
	private String origin;
	private int availability;
	public Vegetable() {
		super();
	}
	public Vegetable(Integer id, String name, double price, String origin, int availability) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.origin = origin;
		this.availability = availability;
	}
	public Vegetable( String name, double price, String origin, int availability) {
		super();
		this.name = name;
		this.price = price;
		this.origin = origin;
		this.availability = availability;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", Price=" + price + ", Origin=" + origin + ", Availability="
				+ availability ;
	}
	
}
