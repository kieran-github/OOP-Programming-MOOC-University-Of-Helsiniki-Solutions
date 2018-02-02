import java.util.Scanner;

public class Palindrome {
	
	private static String buffer = "";
	private static String word;
	private static String textReversed;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	    System.out.println("Type a text: ");
	    word = input.nextLine();
	    if (palindrome(word)) {
	       System.out.println("The text is a palindrome!");
	    } else {
	       System.out.println("The text is not a palindrome!");
	    }
	}
	
	public static String reverse(String text) {
		for (int i = text.length() -1; i >= 0; i--) {
			buffer += text.charAt(i);
		}
		return buffer;
	}
	public static boolean palindrome(String text) {
		textReversed = reverse(text);
		if (text.equals(textReversed)) {
			return true;
		}
		else {
			return false;
		}
	}
}
