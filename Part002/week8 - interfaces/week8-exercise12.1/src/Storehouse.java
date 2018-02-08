import java.util.HashMap;
import java.util.Map;

public class Storehouse {
	private Map<String, Integer>products = new HashMap<String, Integer>();
	private int stock;
	public void addProduct(String product, int price, int stock) {
		products.put(product, price);
		this.stock = stock;
	}
	public int price(String product) {
		if (products.containsKey(product)) {
			return products.get(product);
		}
		else {
			return -99;
		}
	}
}
