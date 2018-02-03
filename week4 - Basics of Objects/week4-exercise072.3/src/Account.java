
public class Account {
	private double balance;
	private String name;
	
	public Account(String inputName, double inputBalance){
		this.name = inputName;
		this.balance = inputBalance;
	}
	public double balance() {
		return this.balance;
	}
	public void deposit(double inputtedCash) {
		this.balance += inputtedCash;
	}
	public double withdrawl(double cashAmount) {
		this.balance -= cashAmount;
		return cashAmount;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.balance;
	}
	

}