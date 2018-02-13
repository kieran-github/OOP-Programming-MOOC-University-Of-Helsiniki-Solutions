package boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box{
	private ArrayList<Thing>myBlackHoleBox;

	public BlackHoleBox() {
		this.myBlackHoleBox = new ArrayList<Thing>();
	}
		@Override
	public void add(Thing thing) {
		this.myBlackHoleBox.add(thing);
	
	}
	@Override
	public boolean isInTheBox(Thing thing) {
		// TODO Auto-generated method stub
		return false;
		}
}

