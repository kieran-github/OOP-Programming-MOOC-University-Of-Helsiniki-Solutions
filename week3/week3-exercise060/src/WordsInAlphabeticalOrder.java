import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class WordsInAlphabeticalOrder {
	private static ArrayList<String>words = new ArrayList<String>();
	private static Scanner input = new Scanner(System.in);
	private static String word;

	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Type a word: ");
			word = input.nextLine();
			if (word.isEmpty()) {
				Collections.sort(words);
				for (String str : words) {
					System.out.println(str);
				}
				break;
			}
			else {
				words.add(word);
			}
		}
	}
}