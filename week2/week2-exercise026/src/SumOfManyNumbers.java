import java.util.Scanner;

public class SumOfManyNumbers {
	private static Scanner input = new Scanner(System.in);
	private static int sum = 0;
	private static int userInputNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Enter a number: ");
			userInputNumber = input.nextInt();
			
			if (userInputNumber == 0) {
				break;
			}
			else {
				sum += userInputNumber;
				System.out.println("Sum now: " + sum);
			}
		}
		System.out.println("Sum in the end: " + sum);
	}
}
