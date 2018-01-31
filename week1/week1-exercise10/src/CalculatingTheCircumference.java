import java.util.Scanner;

import javax.xml.transform.Result;

public class CalculatingTheCircumference {
	private static Scanner input = new Scanner(System.in);
	private static int radius;
	private static double result;
	private static double pi = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type the radius: ");
		radius = input.nextInt();
		result = (2 * pi) * radius;
		System.out.println("Circumference of the circle: " + result);
	}

}
