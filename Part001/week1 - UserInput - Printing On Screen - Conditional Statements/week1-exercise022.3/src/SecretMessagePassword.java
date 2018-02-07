import java.util.Scanner;

public class SecretMessagePassword {
	private static String password = "carrot";
	private static String passowordAttempt;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Type the password: ");
			passowordAttempt = input.nextLine();
			if (passowordAttempt.equals(password)) {
				System.out.println("Right!");
				System.out.println("The secret is: My name is Kieran");
				break;
			}
			else {
				System.out.println("Wrong!");
			}
		}
		
	}

}
