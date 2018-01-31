import java.util.Scanner;

public class APositiveNumber {
	private static Scanner input = new Scanner(System.in);
	private static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a number: ");
		num = input.nextInt();
		if (num >= 0) {
			System.out.println("The number is positive.");
		}
		else {
			System.out.println("The number is not positive.");
		}
			
	}

}
