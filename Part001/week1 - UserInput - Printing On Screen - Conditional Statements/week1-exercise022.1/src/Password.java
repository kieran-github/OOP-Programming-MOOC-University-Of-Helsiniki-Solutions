import java.util.Scanner;

public class Password {
	private static Scanner input = new Scanner(System.in);
	private static String password = "carrot";
	private static String passwordAttempt;
	
	public static void main(String[] args) {
		System.out.println("Type the password: ");
		passwordAttempt = input.nextLine();
		if (passwordAttempt.equals(password)) {
			System.out.println("Right!");
		}
		else {
			System.out.println("Wrong!");
		}
	}
}
