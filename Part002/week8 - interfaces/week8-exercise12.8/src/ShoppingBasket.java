import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ShoppingBasket {
	Map<String, Purchase>basket;
	
	public ShoppingBasket() {
		// TODO Auto-generated constructor stub
		this.basket = new HashMap<String, Purchase>();
	}
	public void add(String product, int price) {
		if (this.basket.containsKey(product)) {
			this.basket.get(product).increaseAmount();
		}
		else {
			Purchase newPurchase = new Purchase(product, 1, price);
			this.basket.put(product, newPurchase);
		}
	}
	public int price() {
		int total = 0;
		for (Purchase purchase : basket.values()) {
			total += purchase.price();
		}
		return total;
	}
	public void print() {
		for (Purchase purchase : basket.values()) {
			System.out.println(purchase.toString());
		}
	}
}
