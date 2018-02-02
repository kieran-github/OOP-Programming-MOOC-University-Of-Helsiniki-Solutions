import java.util.Scanner;

public class GradesAndPoints {
	private static Scanner input = new Scanner(System.in);
	private static int points;

	public static void main(String[] args) {
		System.out.println("Type the points [0-60]: ");
		points = input.nextInt();
		if (points >= 0 && points < 29) {
			System.out.println("Failed");
		}
		else if (points >= 30 && points <= 32) {
			System.out.println("Grade 1");
		}
		else if (points >= 35 && points <=39) {
			System.out.println("Grade 2");
		}
		else if (points >= 40 && points <= 44) {
			System.out.println("Grade 3.");
		}
		else if (points >= 45 && points <= 49) {
			System.out.println("Grade 4.");
		}
		else if (points >= 50 && points <= 60) {
			System.out.println("Grade 5");
		}
		else {
			System.err.println("Points not recognized.");
		}
	}

}
