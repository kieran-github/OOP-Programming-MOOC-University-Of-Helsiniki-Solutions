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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.sum + " things " + "( " + this.currentWeight + " kg)";
	}
	
	
}

