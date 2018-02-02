import java.util.Scanner;

public class FirstCharacter {
	private static Scanner input = new Scanner(System.in);
	private static String name;
	private static char firstCharacter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your name: ");
		name = input.nextLine();
		System.out.println("First character: " + firstCharacter(name));
		

	}
	private static char firstCharacter(String text) {
		firstCharacter = text.charAt(0);
		return firstCharacter;
	}

}
