import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeHost;

public class Box {
	private ArrayList<ToBeStored>things;
	private double maxWeight;
	public Box(double inputMaxWeight) {
		this.maxWeight = inputMaxWeight;
		things = new ArrayList<ToBeStored>();
	}
	public double weight() {
		double weight = 0;
		for (ToBeStored t : things) {
			weight += t.weight();
		}
		return weight;
		}
	
	public void add(ToBeStored i) {
		if (i.weight() + this.weight() < this.maxWeight) {
			this.things.add(i);
		}
		else {
			System.out.println("Not enough space. ");
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Box: " + this.things.size() + ", " + "total weight " + this.weight() + " kg";
	}
}
