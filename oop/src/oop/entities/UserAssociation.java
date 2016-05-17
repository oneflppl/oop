package oop.entities;

public class UserAssociation {
	
	private User user;
	private Produkt produkt;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Produkt getProdukt() {
		return produkt;
	}
	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}
	public UserAssociation(User user, Produkt produkt) {
	//	super();
		this.user = user;
		this.produkt = produkt;
	}
	
	
	
}
