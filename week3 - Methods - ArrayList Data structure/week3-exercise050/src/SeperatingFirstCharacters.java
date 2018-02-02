import java.util.Scanner;

public class SeperatingFirstCharacters {
	private static Scanner input = new Scanner(System.in);
	private static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your name: ");
		name = input.nextLine();
		printFirstThreeCharacters(name);
	}
	private static void printFirstThreeCharacters(String text) {
		if (text.length() < 3) {
			System.out.println("Text needs to exceed three characters.");
		}
		else 
		{
			for (int i = 0; i < 3; i++) {
				System.out.println(i + 1 + ". " + "Character: " + text.charAt(i));
			}
		}
	}
}
