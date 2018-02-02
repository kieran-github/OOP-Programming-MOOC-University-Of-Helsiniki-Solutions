import java.util.Scanner;

public class TheSumOfASetOfNumbers {
	private static Scanner input = new Scanner(System.in);
	private static int sum = 0;
	private static int inputNum;
	private static int counter = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Until what?");
		inputNum = input.nextInt();
		while (counter <= inputNum) {
			sum += counter;
			counter += 1;			
		}
		System.out.println("Sum is: " + sum);
	}

}
