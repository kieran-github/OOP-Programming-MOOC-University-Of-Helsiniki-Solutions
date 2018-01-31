import java.util.Scanner;

public class EvenOrOdd {
	private static int num;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a number: ");
		num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number " + num + " is even.");
		}
		else {
			System.out.println("Number " + num + " is odd.");
		}
	}

}
