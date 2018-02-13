package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
	private ArrayList<Double>containerHistory;

	public ContainerHistory() {
		// TODO Auto-generated constructor stub
		this.containerHistory = new ArrayList<Double>();
	}
	public void add(double situation)
	{
		this.containerHistory.add(situation);
	}
	public void reset() {
		this.containerHistory.clear();
	}
	public double maxValue() {
		return Collections.max(this.containerHistory);
	}
	public double minValue() {
		return Collections.min(this.containerHistory);
	}
	public double average() {
		if (this.containerHistory.isEmpty()) {
			return 0;
		}
		else {
			double sum = 0;
			for (Double c : this.containerHistory) {
				sum += c;
			}
			return sum / this.containerHistory.size();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.containerHistory.toString();
	}
}
