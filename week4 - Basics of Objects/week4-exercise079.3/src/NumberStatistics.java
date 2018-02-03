import java.util.ArrayList;

public class NumberStatistics {
	private ArrayList<Integer> numbers = new ArrayList<Integer>();

	
	public void addNumber(int inputNum) {
		numbers.add(inputNum);
	}
	public int amountOfNumbers() {
		return numbers.size();
	}
	public int sum() {
		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		return sum;
	}
	public double average(){
		int sum = 0;
		double average;
		for (Integer i : numbers) {
			sum += i;
		}
		return average = sum / (double)numbers.size();
		
	}
}
