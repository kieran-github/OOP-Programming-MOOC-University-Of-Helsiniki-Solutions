package containers;

import java.util.ArrayList;

public class ProductContainerRecorder extends ProductContainer{
	private ArrayList<Double> myContainerHisory;

	public ProductContainerRecorder(String inputProductName, double capacity, double initialVolume) {
		super(inputProductName, capacity);
		super.addToTheContainer(initialVolume);
		this.myContainerHisory = new ArrayList<Double>();
		this.myContainerHisory.add(initialVolume);
	}
	public String history() {
		return this.myContainerHisory.toString();
	}

}
