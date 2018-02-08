import java.util.HashMap;
import java.util.Map;

public class Storehouse {
	private Map<String, Integer>products = new HashMap<String, Integer>();
	private Map<String, Integer>stocks = new HashMap<String, Integer>();
	
	public void addProduct(String product, int price, int stock) {
		this.products.put(product, price);
		this.stocks.put(product, stock);

	}
	public int price(String product) {
		if (this.products.containsKey(product)) {
			return this.products.get(product);
		}
		else {
			return -99;
		}
	}
	public int stock(String product) {
		if (this.stocks.containsKey(product)) {
			return this.stocks.get(product);
		}
		else{
			return 0;
		}
	}
	public boolean take(String product) {
		boolean flag = true;
		for (String p : this.stocks.keySet()) {
			if (p.equals(p)) {
				if (this.stocks.get(p) > 0) {
					this.stocks.put(p, this.stocks.get(p) - 1);
					flag = true;
				}
				else {
					 flag = false;
				}
			}
			else {
				flag = false;
			}
		}
		return flag;
	}
}
