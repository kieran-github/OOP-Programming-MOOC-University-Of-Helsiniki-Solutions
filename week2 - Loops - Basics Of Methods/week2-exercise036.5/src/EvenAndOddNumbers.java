import java.util.Scanner;

public class EvenAndOddNumbers {
	private static Scanner input = new Scanner(System.in);
	private static int num;
	private static int sum = 0;
	private static double counter = 0;
	private static double average;
	private static int evenNumber = 0;
	private static int oddNumber = 0;

	public static void main(String[] args) {
		System.out.println("Type Numbers: ");
		while (true) {
			if (num != -1) {
				num = input.nextInt();
				if (num != -1) {
					sum += num;
					counter += 1;
					if (num % 2 == 0) {
						evenNumber += 1;
					}
					else {
						oddNumber += 1;
					}
				}
			}
			else {
				System.out.println("Thank you  and see you later! ");
				System.out.println("The sum is: " + sum);
				System.out.println("How many numbers: " + (int)counter);
				System.out.println("Average: " + (average = sum / counter));
				System.out.println("Even Numbers: " + evenNumber);
				System.out.println("Odd numbers: " + oddNumber);
				break;
			}
			
			
		}

	}

}
