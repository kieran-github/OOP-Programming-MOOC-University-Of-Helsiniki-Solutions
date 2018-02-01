import java.util.Scanner;

public class SumOfThePowers {
	private static Scanner input = new Scanner(System.in);
	private static int inputNum;
	private static double counter = 0;
	private static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a number: ");
		inputNum = input.nextInt();
		while (counter <= inputNum) {
			sum += (int)Math.pow(2, counter);
			counter += 1;
		}
		System.out.println("The result is: " + sum);
	}

}
