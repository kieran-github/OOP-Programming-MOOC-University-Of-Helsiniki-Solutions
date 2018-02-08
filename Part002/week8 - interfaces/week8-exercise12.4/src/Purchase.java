
public class Purchase {
	private String product;
	private int amount;
	private int unitPrice;

	public Purchase(String inputProduct, int inputAmount, int inputUnitPrice) {
		this.product = inputProduct;
		this.amount = inputAmount;
		this.unitPrice = inputUnitPrice;
	}
	public int price() {
		return this.unitPrice * this.amount;
	}
	public void increaseAmount() {
		this.amount += 1;
	}
	@Override
	public String toString() {
		return this.product + ": " + this.amount; 
	}
}
