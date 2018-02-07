import java.util.HashMap;

public class PromissoryNote {
	private HashMap<String, Double>debt = new HashMap<String, Double>();
	
	public PromissoryNote() {
		// TODO Auto-generated constructor stub	
	}
	public void setLoan(String toWhom, double value) {
		this.debt.put(toWhom, value);
	}
	public double howMuchIsTheDebt(String whose) {
		if (debt.containsKey(whose)) {
			return debt.get(whose);
		}
		else {
			return 0.0;
		}
		
	}

}
