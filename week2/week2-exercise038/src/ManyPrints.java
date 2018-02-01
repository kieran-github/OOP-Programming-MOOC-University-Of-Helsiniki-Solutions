import java.util.Scanner;

public class ManyPrints {
	private static Scanner input = new Scanner(System.in);
	private static int num;
	private static int counter = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many?");
		num = input.nextInt();
		while (counter <= num) {
			printText();
			counter += 1;
		}
	}
	public static void printText() {
		System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
	}

}
