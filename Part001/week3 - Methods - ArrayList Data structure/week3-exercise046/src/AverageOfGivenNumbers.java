
public class AverageOfGivenNumbers {
	private static double average;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double answer = average(4, 3, 6, 1);
	    System.out.println("average: " + answer);
	}
	private static double average(int number1, int number2, int number3, int number4) {
	    average = ((double)number1 + (double)number2 + (double)number3 + (double)number4) / 4;
		return average;
	}

}
