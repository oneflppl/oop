package oop.entities;

public class Magazyn {

	public Magazyn() {
		// TODO Auto-generated constructor stub
	}
	
	void create()
	{
		
		String produkn = "nazwa";
		
		Produkt p = new  Produkt(1,produkn,1.0f);
		Produkt p1 = new  Produkt(2,"prod2",3.0f);
		
		UserAgregation u1 = new UserAgregation(1, "ja", "ja", 20,p);
		produkn ="bronek";
		
		System.out.println(u1.getProdukt().getName());
		
		//u1.getProdukt().setName("a2");
		System.out.println(p.getName());
	
		
		
		
	}
	
}
