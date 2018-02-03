
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
	public void loadMoney(double amount) {
		if (amount < 0) {
			System.out.println("You can't add a negative amount. ");
		}
		else if (this.balance + amount >= 150.00) {
			this.balance = 150.00;
		}else {
			this.balance += amount;
		}
	}
	
	@Override
	public String toString() {
		return "The card has " + this.balance + " euros";
	}
}
