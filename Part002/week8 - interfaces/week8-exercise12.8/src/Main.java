import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    Storehouse store = new Storehouse();
	    store.addProduct("coffee", 5, 10);
	    store.addProduct("milk", 3, 20);
	    store.addProduct("milkbutter", 2, 55);
	    store.addProduct("bread", 7, 8);

	    Shop shop = new Shop(store, input);
	    shop.manage("Pekka");
            
	}
}
