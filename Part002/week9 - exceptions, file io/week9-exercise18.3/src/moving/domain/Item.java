package moving.domain;

public class Item implements Thing, Comparable<Item>{
	private String name;
	private int volume;

	public Item(String inputName, int inputVolume) {
		this.name = inputName;
		this.volume = inputVolume;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return this.volume;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " (" + this.volume + " dm^3" + ")";
	}

	@Override
	public int compareTo(Item o) {
		return this.volume - o.getVolume();
	}
}
