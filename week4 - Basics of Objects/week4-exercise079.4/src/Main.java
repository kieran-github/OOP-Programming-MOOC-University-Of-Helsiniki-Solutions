import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);
	private static NumberStatistics sum = new NumberStatistics();
	private static NumberStatistics even = new NumberStatistics();
	private static NumberStatistics odd = new NumberStatistics();
	private static int num;
	
    public static void main(String[] args) {
    	System.out.println("Type numbers: ");
    	while (true) {
			num = input.nextInt();
			if (num == -1) {
				System.out.println("Sum: " + sum.sum());
				System.out.println("Sum of even: " + even.sum());
				System.out.println("Sum of odd: " + odd.sum());
				break;
			}
			else if (num % 2 == 0) {
				even.addNumber(num);
			}
			else {
				odd.addNumber(num);
			}
			sum.addNumber(num);
		}
    }
}