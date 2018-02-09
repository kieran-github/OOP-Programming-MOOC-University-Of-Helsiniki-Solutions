package moving.domain;

import java.util.ArrayList;

public class Box implements Thing{
	private int maxCapactity;
	private ArrayList<Thing> myThings;
	
	public Box(int inputMaximumCapactity) {
		this.maxCapactity = inputMaximumCapactity;
		this.myThings = new ArrayList<Thing>();
	}
	public boolean addThing(Thing inputThing) {
		boolean flag;
		if (this.maxCapactity >= inputThing.getVolume() + this.getVolume()) {
			this.myThings.add(inputThing);
			flag = true;
		}
		else {
			flag = false;
		}
		return flag;
	}
	
	@Override
	public int getVolume() {
		int currentCapacity = 0;
		for (Thing thing : myThings) {
			currentCapacity += thing.getVolume();
		}
		return currentCapacity;
	}
}
