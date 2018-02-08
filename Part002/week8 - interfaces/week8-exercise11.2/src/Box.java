import java.util.ArrayList;

public class Box {
	private double maxWeight;
	private ArrayList<ToBeStored>things;
	
	public Box(double inputMaxWeight) {
		this.maxWeight = inputMaxWeight;
		things = new ArrayList<ToBeStored>();
	}
}
