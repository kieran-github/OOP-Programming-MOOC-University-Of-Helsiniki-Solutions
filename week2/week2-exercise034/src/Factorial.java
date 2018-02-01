import java.util.Scanner;

public class Factorial {
	private static int inputNum;
	private static int counter = 1;
	private static int sum = 1;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a number: ");
		inputNum = input.nextInt();
		if (inputNum <= 1) {
			System.out.println("Cannot find factorial of " + inputNum + ".");
		}
		else {
			while (counter <= inputNum) {
				sum *= counter;
				counter += 1;
			}
			System.out.println("Factorial is: " + sum);
		}
	}
}
