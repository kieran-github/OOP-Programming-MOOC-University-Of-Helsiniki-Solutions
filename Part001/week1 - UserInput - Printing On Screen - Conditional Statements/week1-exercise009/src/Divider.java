import java.util.Scanner;

public class Divider {
	private static double num1;
	private static double num2;
	private static double result;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a number: ");
		num1 = input.nextDouble();
		System.out.println("Type another number: ");
		num2 = input.nextDouble();
		result = num1 / num2;
		System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
	}

}
