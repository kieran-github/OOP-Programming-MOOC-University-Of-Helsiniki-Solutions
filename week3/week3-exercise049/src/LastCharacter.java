import java.security.KeyStore.PrivateKeyEntry;
import java.util.Scanner;

public class LastCharacter {
	private static Scanner input = new Scanner(System.in);
	private static String name;
	private static char lastCharacter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type your name: ");
		name = input.nextLine();
		System.out.println("Last character: " + lastCharacter(name));

	}
	private static char lastCharacter(String text) {
		lastCharacter = text.charAt(text.length()-1);
		return lastCharacter;
	}

}
