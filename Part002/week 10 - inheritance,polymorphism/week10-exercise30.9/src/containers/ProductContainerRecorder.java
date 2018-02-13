package containers;



public class ProductContainerRecorder extends ProductContainer{
	private ContainerHistory myHistory;
	private double initialVolume;

	public ProductContainerRecorder(String inputProductName, double capacity, double initialVolume) {
		super(inputProductName, capacity);
		this.myHistory = new ContainerHistory();
		this.myHistory.add(initialVolume);	
		this.initialVolume = initialVolume;
		super.addToTheContainer(initialVolume);
	}
	public String history() {
		return this.myHistory.toString();
	}
	public void addToTheContainer(double amount) {
		this.myHistory.add(this.initialVolume += amount);
		
	}
	public double takeFromTheContainer(double amount)
	{
		myHistory.add(this.initialVolume -= amount);
		return super.takeFromTheContainer(amount);
	}
	public void printAnalysis() {
		System.out.println("Product: " + super.getName());
		System.out.println("History:" + this.history());
		System.out.println("Greatest product amount: " + this.myHistory.maxValue());
		System.out.println("Smallest product amount: " + this.myHistory.minValue());
		System.out.println("Average: " + this.myHistory.average());
		System.out.println("Greatest change: " + this.myHistory.greatestFluctuation());
		System.out.println("Variance: " + this.myHistory.variance());
		
	}

}
