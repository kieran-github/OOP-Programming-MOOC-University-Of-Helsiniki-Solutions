import java.util.ArrayList;

public class AverageOfNumbers {
	
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The average is: " + average(list));
	}
	private static double average(ArrayList<Integer>list) {
		double listAverage;
		int sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		listAverage = (double)sum / (double)list.size();
		return listAverage;
	}

}
