import java.util.ArrayList;

public class Variance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The variance is: " + variance(list));
	}
	private static double average(ArrayList<Integer> list) {
		double sum = 0;
		double average;
		for (Integer i : list) {
			sum += i;
		}
		return average = sum / list.size();
	}
	private static double variance(ArrayList<Integer> list) {
		double average = average(list);
		double variance = 0;
		for (Integer i : list) {
			variance += Math.pow((i - average), 2);
		}
		return variance / (list.size() - 1);
	}

}
