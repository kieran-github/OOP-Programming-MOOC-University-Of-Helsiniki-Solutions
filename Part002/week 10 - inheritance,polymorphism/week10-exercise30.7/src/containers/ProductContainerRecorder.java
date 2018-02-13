package containers;

import java.util.ArrayList;

public class ProductContainerRecorder extends ProductContainer{
	private ArrayList<Double> myContainerHisory;
	private double initialVolume;

	public ProductContainerRecorder(String inputProductName, double capacity, double initialVolume) {
		super(inputProductName, capacity);
		this.initialVolume = initialVolume;
		this.myContainerHisory = new ArrayList<Double>();
		
		super.addToTheContainer(initialVolume);
		this.myContainerHisory.add(initialVolume);
	}
	public String history() {
		return this.myContainerHisory.toString();
	}
	public void addToTheContainer(double amount) {
		super.addToTheContainer(amount);
		this.myContainerHisory.add(this.initialVolume += amount);
	}
	public double takeFromTheContainer(double amount)
	{
		this.myContainerHisory.add(this.initialVolume -= amount);
		return super.takeFromTheContainer(amount);
	}

}
