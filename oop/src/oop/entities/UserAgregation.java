package oop.entities;

public class UserAgregation extends User {
	
	private Produkt produkt;
	
	public UserAgregation(int id, String name, String surname, int age, Produkt produkt) {
		super(id,name,surname,age);	
		this.produkt = produkt;
	}

	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	
	
	
}
