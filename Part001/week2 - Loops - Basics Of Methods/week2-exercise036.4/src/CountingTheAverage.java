import java.util.Scanner;

public class CountingTheAverage {
	private static Scanner input = new Scanner(System.in);
	private static int num;
	private static int sum = 0;
	private static double counter = 0;
	private static double average;

	public static void main(String[] args) {
		System.out.println("Type Numbers: ");
		while (true) {
			if (num != -1) {
				num = input.nextInt();
				if (num != -1) {
					sum += num;
					counter += 1;
				}
			}
			else {
				System.out.println("Thank you  and see you later! ");
				System.out.println("The sum is: " + sum);
				System.out.println("How many numbers: " + (int)counter);
				System.out.println("Average: " + (average = sum / counter));
				break;
			}
			
			
		}

	}

}
