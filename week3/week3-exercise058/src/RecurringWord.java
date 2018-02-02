import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
	private static ArrayList<String> words = new ArrayList<String>();
	private static String word;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Type a word: ");
			word = input.nextLine();
			if (words.contains(word)) {
				System.out.println("You have the word " + word + " twice.");
				break;
			}
			else {
				words.add(word);
			}
		}
	}
}
