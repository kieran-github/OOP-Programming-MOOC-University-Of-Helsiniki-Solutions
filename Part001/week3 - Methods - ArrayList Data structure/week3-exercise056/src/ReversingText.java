import java.util.Scanner;

public class ReversingText {
	private static Scanner input = new Scanner(System.in);
	private static String word;
	private static String buffer = "";
	

	public static void main(String[] args) {
	    System.out.print("Type in your text: ");
	    String word = input.nextLine();
	    System.out.println("In reverse order: " + reverse(word));

	}
	private static String reverse(String text) {
		for (int i = text.length() -1; i >= 0; i--) {
			buffer += text.charAt(i);
		}
		return buffer;
	}

}
