package phonesearch;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TextInterface ui = new TextInterface(input);
		ui.start();
	}
	
}
