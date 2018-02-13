package containers;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.StyledEditorKit.ForegroundAction;

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
	public double greatestFluctuation() {
		if (this.containerHistory.isEmpty() || this.containerHistory.size() == 1) {
			return 0;
		}
		else {
			double greatestFluc = this.containerHistory.get(0) - this.containerHistory.get(1);
			for (int i = 1; i < this.containerHistory.size() -1; i++) {
				if ((Math.abs(this.containerHistory.get(i) - this.containerHistory.get(i + 1))) > greatestFluc) {
					greatestFluc = Math.abs(this.containerHistory.get(i) - this.containerHistory.get(i + 1));
				}
				else {
					continue;
				}
			}
			return Math.abs(greatestFluc);
		}
	}
	public double variance() {
		double sum = 0;
		double variance = 0;
		for (Double c : containerHistory) {
			sum += c;
		}
		double average = sum/containerHistory.size();
		for (Double ct : containerHistory) {
			variance += Math.pow((ct - average), 2);
		}
		return variance / containerHistory.size()-1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.containerHistory.toString();
	}
}
