import java.util.Scanner;

public class whileLoopPassword {
	private static String password = "carrot";
	private static String passwordAttempt;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Type the password: ");
			passwordAttempt = input.nextLine();
			if (passwordAttempt.equals(password)) {
				System.out.println("Right!");
				break;
			}
			else {
				System.out.println("Wrong!");
			}
		}
	}

}
