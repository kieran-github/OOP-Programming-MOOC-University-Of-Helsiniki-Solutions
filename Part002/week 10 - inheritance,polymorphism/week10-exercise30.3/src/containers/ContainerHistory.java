package containers;

import java.util.ArrayList;

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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.containerHistory.toString();
	}
}
