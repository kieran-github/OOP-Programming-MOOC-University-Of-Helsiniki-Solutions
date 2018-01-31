import java.util.Scanner;

public class BiggerNumber {
	
	private static int num1;
	private static int num2;
	private static int max;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a number: ");
		num1 = input.nextInt();
		System.out.println("Type another number: ");
		num2 = input.nextInt();
		max = Math.max(num1, num2);
		System.out.println("The bigger number of the two numbers given was: " + max);
	}

}
