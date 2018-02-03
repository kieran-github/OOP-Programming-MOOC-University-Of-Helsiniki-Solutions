
public class LyyraCard {
	private double balance;
	public LyyraCard(double startingBalance) {
		this.balance = startingBalance;
	}
	
	@Override
	public String toString() {
		return "The card has " + this.balance + " euros";
	}
}
