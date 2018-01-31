import java.util.Scanner;

public class AgeOfMajority {
	private static Scanner input = new Scanner(System.in);
	private static int age;
	
	public static void main(String[] args) {
		System.out.println("How old are you? ");
		age = input.nextInt();
		if (age >= 18) {
			System.out.println("You have reached the age of majority!");
		}
		else {
			System.out.println("You have not reached the age of majority yet!");
		}
	}
}
