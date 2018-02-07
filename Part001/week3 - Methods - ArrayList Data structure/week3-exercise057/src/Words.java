import java.util.ArrayList;
import java.util.Scanner;

public class Words {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<String>words = new ArrayList<String>();
	private static String word;

	public static void main(String[] args) {
		while (true) {
			System.out.println("Type a word: ");
			word = input.nextLine();
			if (word.isEmpty()) {
				break;
			}
			else {
				words.add(word);
			}
		}
		System.out.println("You typed the following words: ");
		for (String str : words) {
			System.out.println(str);
		}

	}

}
