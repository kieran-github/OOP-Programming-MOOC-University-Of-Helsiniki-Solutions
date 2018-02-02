import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class SeperatingCharacters {
	private static Scanner input = new Scanner(System.in);
	private static String name;
	private static int counter = 1;
	private static int charIndex = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your name: ");
		name = input.nextLine();
		printCharactersSeperately(name);
	}
	private static void printCharactersSeperately(String text) {
		while (counter <= text.length()) {
			System.out.println(counter + ". " + "Character: " + text.charAt(charIndex));
			counter += 1;
			charIndex += 1;
		}
	}

}
