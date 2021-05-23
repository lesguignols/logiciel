package projetM1.graphql.price;


public class Price {
	
	//private static final AtomicInteger count = new AtomicInteger(0); 
	private final int id_price;
	private final String name;
	private final double price;
	private final boolean active;
	
	public Price(int id,String name, double price, boolean active) {
		super();
		this.id_price = id;
		this.name = name;
		this.price = price;
		this.active = active;
	}

	public int getId_price() {
		return id_price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean isActive() {
		return active;
	}
	
	
	
	

}
