import java.util.Scanner;

public class SumOfThreeNumbers {
	private static Scanner input = new Scanner(System.in);
	private static int num1;
	private static int num2;
	private static int num3;
	private static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println("Type the first number");
		num1= input.nextInt();
		System.out.println("Type the second number");
		num2= input.nextInt();
		System.out.println("Type the third number");
		num3= input.nextInt();
		sum = num1 + num2 + num3;
		System.out.println("Sum: " + sum);
	}

}
