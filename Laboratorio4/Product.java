public class Product {
	private String name;
	private double price;	
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void reducePrice(double rate) {
		price = price - price*rate/100;
	}
	
	public String toString() {
		return "Prodotto "+name+" al modico prezzo di "+price+" euro";
	}
}
