import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
	private static Scanner input = new Scanner(System.in);
	private static int num1;
	private static int num2;
	private static int sum = 0;
	public static void main(String[] args) {
		System.out.println("First: ");
		num1 = input.nextInt();
		System.out.println("Last: ");
		num2 = input.nextInt();

		while (num1 <= num2) {
			sum += num1;
			num1 += 1;
		}
		System.out.println("The sum is: " + sum);
	}

}
