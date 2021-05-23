package projetM1.graphql.offer;

import java.util.ArrayList;
import java.util.List;


public class Offer {
	
	private final int id_offer;
	private final String name;
	private final boolean active;
	private final double price;
	private List<Integer> id_products = new ArrayList<Integer>();
	
	public Offer(int id_offer, String name, boolean active, double price, List<Integer> id_products2) {
		super();
		this.id_offer = id_offer;
		this.name = name;
		this.active = active;
		this.price = price;
		this.id_products = id_products2;
	}
	
	

	public List<Integer> getId_products() {
		return id_products;
	}


	public int getId_offer() {
		return id_offer;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}

	public double getPrice() {
		return price;
	}


}
