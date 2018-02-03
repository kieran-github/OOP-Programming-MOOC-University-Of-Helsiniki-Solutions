
public class YourFirstAccount {
	private static Account kieran = new Account("kieran", 100.00);

	public static void main(String[] args) {
		kieran.deposit(20.00);
		System.out.println(kieran);

	}

}
