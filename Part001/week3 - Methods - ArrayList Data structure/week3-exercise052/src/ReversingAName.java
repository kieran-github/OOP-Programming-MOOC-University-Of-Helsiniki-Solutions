import java.util.Scanner;

public class ReversingAName {
	private static Scanner input = new Scanner(System.in);
	private static String name;
	private static String buffer = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your name: ");
		name = input.nextLine();
		System.out.println("In reverse order: " + printReverse(name));

	}
	private static String printReverse(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			buffer += text.charAt(i);
		}
		return buffer;
	}

}
