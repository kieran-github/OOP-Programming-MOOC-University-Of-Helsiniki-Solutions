import java.util.Scanner;

public class GreaterNumber {
	private static int num1;
	private static int num2;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type the first number: ");
		num1 = input.nextInt();
		System.out.println("Type the second number: ");
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println("Greater number: " + num1);
		}
		else if (num2 > num1) {
			System.out.println("Greater number: " + num2);
		}
		else {
			System.out.println("The numbers are equal!");
		}
	}

}
