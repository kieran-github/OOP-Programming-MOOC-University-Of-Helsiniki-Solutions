import java.util.ArrayList;

public class NumberStatistics {
	private ArrayList<Integer> numbers = new ArrayList<Integer>();;
	
	public void addNumber(int inputNum) {
		numbers.add(inputNum);
	}
	public int amountOfNumbers() {
		return numbers.size();
	}
}
