import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static String name;
	private static String latinName;
	private static String command;
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Bird>birds = new ArrayList<Bird>();
	private static String Query;
	public static void main(String[] args) {
		

		while (true) {
			System.out.print("? ");
			command = input.nextLine();
			if (command.toUpperCase().equals("Add".toUpperCase())) {
				add();
			}
			else if (command.equals("Observation")) {
				observation();
			}
			else if (command.equals("Statistics")) {
				stats();
			}
			else if (command.toUpperCase().equals("Show".toUpperCase())) {
				show();
			}
			else if (command.toUpperCase().equals("Quit".toUpperCase())) {
				break;
			}
			else {
				break;
			}
		}
	
	}
	private static void add() {
		System.out.println("Name:");
		name = input.nextLine();
		System.out.println("Latin Name: ");
		latinName = input.nextLine();
		Bird bird = new Bird(name, latinName);
		birds.add(bird);
		
	}
	private static void observation() {
		System.out.println("What was observed? ");
		Query = input.nextLine();
		for (Bird bird : birds) {
			if (bird.toString().contains(Query)) {
				bird.updateObs();
			}
			else {
				System.out.println("It's not a bird!");
			}
		}
	}
	private static void stats() {
		for (Bird bird : birds) {
			System.out.print(bird.toString() + " " + bird.getObs() + " observations");
			System.out.println(" ");
		}
	}
	private static void show() {
		System.out.println("What?");
		Query = input.nextLine();
		for (Bird bird : birds) {
			if (Query.equals(bird.toString())) {
				System.out.println(bird.toString());
			}
			else {
				System.out.println("It's not a bird!");
			}
		}
		
	}
}
