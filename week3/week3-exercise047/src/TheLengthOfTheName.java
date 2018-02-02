import java.util.Scanner;

public class TheLengthOfTheName {
	private static int length;
	private static Scanner input = new Scanner(System.in);
	private static String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your name: ");
		name = input.nextLine();
		System.out.println("Number of characters: " +  calculateCharacters(name));
				
	}
	private static int calculateCharacters(String text) {
		length = text.length();
		return length;
	}

}
