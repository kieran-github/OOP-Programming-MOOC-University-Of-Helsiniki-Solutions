import java.util.Scanner;

public class Main {
	private static NumberStatistics n = new NumberStatistics();
	private static Scanner input = new Scanner(System.in);
	private static int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println("Type numbers: ");
		while (true) {
			num = input.nextInt();
			if (num == -1) {
				System.out.println("Sum: " + n.sum());
				break;
			}
			else {
				n.addNumber(num);
			}
		}
	}
}
