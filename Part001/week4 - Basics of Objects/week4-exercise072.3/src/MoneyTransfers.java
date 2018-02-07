
public class MoneyTransfers {
	private static Account A = new Account("A", 100.00);
	private static Account B = new Account("B", 0.00);
	private static Account C = new Account("C", 0.00);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		transfer(A, B, 50.00);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		transfer(B, C, 25.00);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

	}
	private static void transfer(Account from, Account to, double howMuch) {
		from.withdrawl(howMuch);
		to.deposit(howMuch);
	}

}
