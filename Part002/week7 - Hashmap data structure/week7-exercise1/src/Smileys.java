
public class Smileys {

	public static void main(String[] args) {
		printWithSmileys("87.");
	}
	private static void printWithSmileys(String characterString) {
		if (characterString.length() % 2 == 0) {
			for (int i = 0; i < characterString.length(); i++) {
				System.out.print(":)");
			}
			System.out.println(" ");
			System.out.println(":)" + characterString + ":)");
			for (int i = 0; i < characterString.length(); i++) {
				System.out.print(":)");
			}
		}
		else {
			characterString = characterString + " ";
			for (int i = 0; i < characterString.length() + 1; i++) {
				System.out.print(":)");
			}
			System.out.println(" ");
			System.out.println(":)" + characterString + "  :)");
			for (int i = 0; i < characterString.length()  + 1; i++) {
				System.out.print(":)");
			}
		}
	}
}
