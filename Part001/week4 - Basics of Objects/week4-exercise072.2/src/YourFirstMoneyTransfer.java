import javax.swing.border.MatteBorder;

public class YourFirstMoneyTransfer {
	private static Account matt = new Account("Matt's account", 1000.00);
	private static Account kieran = new Account("My account", 0.00);
	
	
	public static void main(String[] args) {
		matt.withdrawl(100.00);
		kieran.deposit(100);
		System.out.println(matt);
		System.out.println(kieran);

	}

}
