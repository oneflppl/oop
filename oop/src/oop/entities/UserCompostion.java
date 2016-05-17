package oop.entities;

public class UserCompostion extends User {

	private Produkt produkt;
	
	public UserCompostion(int id, String name, String surname, int age) {
		super(id,name,surname,age);	
		this.produkt = new Produkt();
	}

	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	
}
