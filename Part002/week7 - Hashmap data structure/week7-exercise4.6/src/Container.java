import java.util.ArrayList;

public class Container {
	private int maxWeight;
	private int sum = 0;
	private int totalweight = 0;
	private ArrayList<Suitcase>suitcases = new ArrayList<Suitcase>();
	
	public Container(int inputMaxWeight) {
		this.maxWeight = inputMaxWeight;
	}
	public void addSuitcase(Suitcase suitcase) {
		if (suitcase.totalWeight() < this.maxWeight) {
			this.sum += 1;
			suitcases.add(suitcase);
			this.totalweight += suitcase.totalWeight();
		}
	}
	public int totalweight() {
		return this.totalweight;
	}
	
	@Override
	public String toString() {
		return this.sum + " suitcases " + " (" + this.totalweight + " kg)";

	}

}
