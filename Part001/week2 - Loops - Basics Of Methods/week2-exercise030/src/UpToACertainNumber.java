import java.util.Scanner;

public class UpToACertainNumber {
	private static Scanner input = new Scanner(System.in);
	private static int counter = 1;
	private static int userInput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Up to what number?");
		userInput = input.nextInt();
		while (counter <= userInput) {
			System.out.println(counter);
			counter += 1;
		}
	}

}
