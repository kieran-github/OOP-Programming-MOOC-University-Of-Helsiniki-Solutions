import java.util.Scanner;

public class TheEndPart {
	private static Scanner input = new Scanner(System.in);
	private static int substringLength;
	private static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a word: ");
		name = input.nextLine();
		System.out.println("Length of the end part: ");
		substringLength = input.nextInt();
		System.out.println("Result: " + getSubstring(substringLength, name));
	}
	private static String getSubstring(int length, String text) {
		return text.substring(length -1, text.length());
	}

}
