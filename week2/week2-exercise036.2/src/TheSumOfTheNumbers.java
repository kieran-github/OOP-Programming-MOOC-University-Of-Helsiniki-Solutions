import java.util.Scanner;

public class TheSumOfTheNumbers {
	private static Scanner input = new Scanner(System.in);
	private static int num;
	private static int sum = 0;

	public static void main(String[] args) {
		System.out.println("Type Numbers: ");
		while (true) {
			if (num != -1) {
				num = input.nextInt();
				if (num != -1) {
					sum += num;
				}
			}
			else {
				System.out.println("Thank you  and see you later! ");
				System.out.println("The sum is: " + sum);
				break;
			}
			
			
		}

	}

}
