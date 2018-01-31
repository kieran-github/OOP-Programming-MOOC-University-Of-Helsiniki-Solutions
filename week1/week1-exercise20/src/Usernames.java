import java.util.Scanner;

public class Usernames {
	private static String username;
	private static String password;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Type your username: ");
		username = input.nextLine();
		System.out.println("Type your password: ");
		password = input.nextLine();
		if (username.equals("alex") && password.equals("mightyducks")) {
			System.out.println("You are now logged into the system! ");
		}
		else if (username.equals("emily") && password.equals("cat")) {
			System.out.println("You are now logged into the system! ");
		}
		else {
			System.out.println("Your username or password was invalid!");
		}
	}

}
