package containers;

public class Container {
	private double originalCapacity;
	private double capacity;
	private double volume = 0.00;
	
	public Container(double inputCapacity) {
		if (inputCapacity <= 0) {
			this.capacity = 0;
		}
		else {
		this.capacity = inputCapacity;
		this.originalCapacity = inputCapacity;
		}
	}
	
	public double getVolume() {
		return this.volume;
	}
	public double getOriginalCapacity() {
		return this.originalCapacity;
	}
	public double getCurrentCapacity() {
		return this.capacity;
	}
	public void addToTheContainer(double amount)
	{
		if (amount <= 0) {
			this.volume += 0;
		}
		else if (this.capacity <= this.volume + amount) {
			this.volume = this.capacity;
		}
		else {
			this.volume += amount;
		}	
	}
	public double takeFromTheContainer(double amount)
	{
		if (amount <= 0) {
			return 0.0;
		}
		else if (amount >= this.capacity) {
			return this.capacity;
		}
		else
		{
			this.volume -= amount;
			return this.volume;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "volume = " + this.volume + ", free space " + Math.abs(this.volume - this.capacity);
	}
}
