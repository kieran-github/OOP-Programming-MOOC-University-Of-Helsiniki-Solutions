
public class Player {
	private String name;
	private int amountOfGoals;
	
	public Player(String inputName) {
		this.name = inputName;
	}
	public Player(String inputName, int inputAmountOfGoal) {

		this.name = inputName;
		this.amountOfGoals = inputAmountOfGoal;
	}
	public String getName() {
		return this.name;
	}
	public int getGoals() {
		return this.amountOfGoals;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Player: " + this.name + ", goals: " + this.amountOfGoals; 
	}
}
