import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ShoppingBasket {
	List<Purchase>b;
	Map<String, Purchase>basket;
	public ShoppingBasket() {
		// TODO Auto-generated constructor stub
		this.b = new ArrayList<Purchase>();
		this.basket = new HashMap<String, Purchase>();
	}
	public void add(String product, int price) {
		Purchase p = new Purchase(product, 1, price);
		b.add(p);
	}
	public int price() {
		int total = 0;
		for (Purchase purchase : b) {
			total += purchase.price();
		}
		return total;
	}
	public void print() {
		for (Purchase purchase : b) {
			System.out.println(purchase.toString());
		}
	}
}
