import java.util.*;

import sun.java2d.cmm.kcms.KcmsServiceProvider;



public class TextUi {
	private Scanner input;
	private ArrayList<Skier>skiers = new ArrayList<Skier>();
	private int round = 1;
	
	public TextUi(Scanner Inputscanner) {
		this.input = Inputscanner;
	}
	public void start() {
		System.out.println("Kumpula ski jumping week");
		System.out.println(" ");
		getSkiers();

	}
	public void getSkiers() {
		String skier;
		System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

		while (true) {
			System.out.print("	Participant name:");
			skier = this.input.nextLine();
			if (skier.isEmpty()) {
				System.out.println("");
				System.out.println("The tournament begins!");
				System.out.println("");
				JumpingTime();
			}
			else {
				skiers.add(new Skier(skier));
			}
		}
	}
	public void JumpingTime() {
		String command;
		while (true) {
			System.out.print("");
			System.out.println("Write \"jump\" to jump; otherwise you quit: ");
			System.out.print("");
			command = this.input.nextLine();
			if (command.equals("jump")) {
				int currentRound = this.getRound();
				System.out.println("");
				System.out.println("Round " + (currentRound));
				System.out.println("");
				System.out.println("Jumping order: ");
				int i = 1;
				for (Skier skier : skiers) {
					System.out.println(i + ". " + skier.toString());
					i += 1;
				}
				System.out.println("");
				System.out.println("Results of round " + currentRound);
				Judge j = new Judge();
				for (Skier skier : skiers) {
					skier.jump();
					System.out.println(skier.getName());
					System.out.println("	" + "Length: " + skier.getScore());
					System.out.println("	" +  "judge votes: " + j.getScores());	
					}
				}
				else {
				System.out.println("Thanks!");
				results();
				break;
				}
			}
		}
	private void results() {
		int count = 1;
		System.out.println("Tournament results:");
		System.out.println("Position    Name");
	
		for (Skier skier : skiers) {
			System.out.println(count + ". " + skier.toString());
			count++;
		}
		System.exit(0);
		
	}
	private int getRound() {
		return this.round++;
	}
}
