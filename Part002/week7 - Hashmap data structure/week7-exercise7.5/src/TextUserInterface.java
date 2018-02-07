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
			else if (command.equals("add")) {
				add();
			}
			else if (command.equals("translate")) {
				translate();
			}
			else {
				System.out.println("Unknown statement. ");
			}
		}
	}
	public void add() {
		System.out.println("In Finnish: ");
		String word = input.nextLine();
		System.out.println("Translation: ");
		String translated = input.nextLine();
		this.myDictionary.add(word, translated);
	}
	public void translate() {
		System.out.println("Give a word: ");
		String translated = input.nextLine();
		System.out.println("Translation: " + this.myDictionary.translate(translated));
	}
}
