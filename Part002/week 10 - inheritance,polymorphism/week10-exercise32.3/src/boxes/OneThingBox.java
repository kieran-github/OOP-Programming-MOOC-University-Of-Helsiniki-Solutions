package boxes;


public class OneThingBox extends Box{
	private Thing myOneThing;
	public OneThingBox() {
	}
	@Override
	public void add(Thing inputThing) {
		if (this.myOneThing == null) {
			this.myOneThing = inputThing;
		}
		
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return thing.equals(this.myOneThing);
	}

}
