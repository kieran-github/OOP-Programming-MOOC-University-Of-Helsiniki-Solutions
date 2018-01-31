import java.util.Scanner;

public class AgeCheck {
	private static int age;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("How old are you?");
		age = input.nextInt();
		if (age < 0) {
			System.out.println("Impossible!");
		}
		else if (age > 120) {
			System.out.println("Impossible!");
		}
		else {
			System.out.println("Ok!");
		}
	}

}
