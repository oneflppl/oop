package oop.entities;

public class Produkt {
	private int id;
	private String name;
	private Float price;
	
	public Produkt() {
		// TODO Auto-generated constructor stub
	}
	
	public Produkt(int id, String name, Float price) {
	//	super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	
}
