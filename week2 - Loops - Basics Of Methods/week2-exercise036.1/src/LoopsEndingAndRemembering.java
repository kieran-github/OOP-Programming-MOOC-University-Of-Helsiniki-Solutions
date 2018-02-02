import java.util.Scanner;

public class LoopsEndingAndRemembering {
	private static Scanner input = new Scanner(System.in);
	private static int num;

	public static void main(String[] args) {
		System.out.println("Type Numbers: ");
		while (true) {
			if (num != -1) {
				num = input.nextInt();
			}
			else {
				System.out.println("Thank you  and see you later! ");
				break;
			}
			
			
		}

	}

}
