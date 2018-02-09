package moving.logic;

import java.util.ArrayList;
import java.util.List;

import moving.domain.Thing;
import moving.domain.Box;

public class Packer {
	private int boxesVolume;
	
	public Packer(int boxesVolume) {
		this.boxesVolume = boxesVolume;

	}
	public List<Box> packThings(List<Thing> things){	
		int count = 0;
		List<Box>buffer = new ArrayList<Box>();
		for (Thing thing : things) {
			buffer.add(new Box(this.boxesVolume));
			buffer.get(count).addThing(thing);
			count++;
		}
		return buffer;
	}
}
