
public class Thing {
	private String name;
	private int weight;
	public Thing(String inputName, int inputWeight) {
		// TODO Auto-generated constructor stub
		this.name = inputName;
		this.weight = inputWeight;
	}
	public String getName() {
		return this.name;
	}
	public int getWeight() {
		return this.weight;
	}
	@Override
	public String toString() {
		return this.name + " (" + this.weight + " kg)";
	}
}
