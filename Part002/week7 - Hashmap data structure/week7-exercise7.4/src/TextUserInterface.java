import java.util.HashMap;
import java.util.Scanner;


public class TextUserInterface {
	
	private Scanner input;
	private Dictionary myDictionary;
	private static String command;
	
	public TextUserInterface(Scanner input, Dictionary dic) {
		this.input = input;
		this.myDictionary = dic;
	}
	public void start() {
		System.out.println("Statement: ");
		System.out.println("  quit - quit the text user interface.");
		while (true) {
			System.out.println("Statement: ");
			command = input.nextLine();
			if (command.equals("quit")) {
				System.out.println("Cheers!");
				break;
			}
			else {
				System.out.println("Unknown statement. ");
			}
		}
	}
}
