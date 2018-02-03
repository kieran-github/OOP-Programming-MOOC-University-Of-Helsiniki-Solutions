
public class LyyraCard {
	private double balance;
	public LyyraCard(double startingBalance) {
		this.balance = startingBalance;
	}
	public void payEconomical() {
		if (this.balance >= 2.50) {
			this.balance -= 2.50;
		}else {
			System.out.println("You have insufficient funds. ");
		}
	}
	public void payGourmet() {
		if (this.balance >= 4.00) {
			this.balance -= 4.00;
		}else {
			System.out.println("You have insufficient funds. ");
		}
	}
	
	@Override
	public String toString() {
		return "The card has " + this.balance + " euros";
	}
}
