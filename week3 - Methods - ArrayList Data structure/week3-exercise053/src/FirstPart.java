import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class FirstPart {
	private static String name;
	private static int substringLength;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a word:");
		name = input.nextLine();
		System.out.println("Length of the first part: ");
		substringLength = input.nextInt();
		System.out.println("Result: " + getSubstring(substringLength, name));
	}
	private static String getSubstring(int length, String text) {
		return text.substring(0, length);
	}

}
