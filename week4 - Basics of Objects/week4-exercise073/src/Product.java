import com.sun.glass.ui.TouchInputSupport;

public class Product {
	private String name;
	private double price;
	private int amount;
	public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
		this.name = nameAtStart;
		this.price = priceAtStart;
		this.amount = amountAtStart;
	}
	public void printProduct() {
		System.out.println(this.name + ", " + this.price + ", " + this.amount + ". ");
	}

}
