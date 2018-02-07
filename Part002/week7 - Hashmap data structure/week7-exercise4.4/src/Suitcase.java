import java.util.ArrayList;

public class Suitcase {
	
	private int maxWeightLimit;
	private int currentWeight = 0;
	private int sum = 0;
	private ArrayList<Thing>things = new ArrayList<Thing>();
	
	public Suitcase(int inputWeightLimit) {
		this.maxWeightLimit = inputWeightLimit;
	}
	
	public void addThing(Thing thing) {
		if (thing.getWeight() + this.currentWeight <= this.maxWeightLimit) {
			things.add(thing);
			sum += 1;
			currentWeight += thing.getWeight();
		}
	}
	public void printThings() {
		for (Thing thing : things) {
			System.out.println(thing.toString());
		}
	}
	public int totalWeight() {
		return this.currentWeight;
	}
	
	@Override
	public String toString() {
		if (this.sum == 0) {
			return "empty" + " (" + this.currentWeight + " kg)";
		}
		else if (this.sum == 1) {
			return this.sum + " thing " + "( " + this.currentWeight + " kg)";
		}
		else {
		return this.sum + " things " + "( " + this.currentWeight + " kg)";
		}
	}
}

