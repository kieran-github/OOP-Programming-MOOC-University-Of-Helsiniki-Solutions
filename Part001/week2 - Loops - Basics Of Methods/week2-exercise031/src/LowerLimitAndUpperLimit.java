import java.util.Scanner;

public class LowerLimitAndUpperLimit {
	private static Scanner input = new Scanner(System.in);
	private static int num1;
	private static int num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First: ");
		num1 = input.nextInt();
		System.out.println("Last: ");
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println("");
		}
		else {
			while (num1 <= num2) {
				System.out.println(num1);
				num1 += 1;
			}
		}
	}

}
