package farmsimulator;

public class BulkTank {
	private double capacity = 2000.00;
	private double volume = 0.00;
	public BulkTank()
	{
		this.capacity = this.capacity;
	}
	public BulkTank(double capacity)
	{
		this.capacity = capacity;
	}
	public double getCapacity()
	{
		return this.capacity;
	}
	public double getVolume()
	{
		return this.volume;
	}
	public double howMuchFreeSpace()
	{
		return this.capacity - volume;
	}
	public void addToTank(double amount) 
	{
		if (this.volume + amount >= this.capacity) {
			this.volume = this.capacity;
		}
		else if (amount <= 0) {
			this.volume += 0;
		}
		else {
			this.volume += amount;
		}
	}
	public void getFromTank(double amount) {
		if (this.volume - amount <= 0) {
			this.volume = 0;
		}
		else {
			this.volume -= amount;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%.2f / %.2f", this.volume, this.capacity);
	}
}
