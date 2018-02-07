import java.util.Scanner;

public class AWordInsideAWord {
	private static Scanner input = new Scanner(System.in);
	private static String word1 = "kieran";
	private static String word2;

	public static void main(String[] args) {
		System.out.println("Type the first word: ");
		word1 = input.nextLine();
		System.out.println("Type the second word: ");
		word2 = input.nextLine();
		findString(word1, word2);
		
	}
	private static void findString(String inputWord1, String inputWord2) {
		if (inputWord1.indexOf(inputWord2) >= 0) {
			System.out.println("The word " + inputWord2 + " is found in the word " + inputWord1);
		}
		else {
			System.out.println("The word " + inputWord2 + " is not found in th word "+ inputWord1);
		}
		
	}

}
