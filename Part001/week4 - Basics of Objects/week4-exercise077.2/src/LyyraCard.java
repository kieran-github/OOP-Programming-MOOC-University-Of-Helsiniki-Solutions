
public class LyyraCard {
	private double balance;
	public LyyraCard(double startingBalance) {
		this.balance = startingBalance;
	}
	public void payEconomical() {
		this.balance -= 2.50;
	}
	public void payGourmet() {
		this.balance -= 4.00;
	}
	
	@Override
	public String toString() {
		return "The card has " + this.balance + " euros";
	}
}
