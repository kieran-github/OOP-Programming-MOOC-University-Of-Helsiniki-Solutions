package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
	UserInterface ui;
	public ApplicationLogic(UserInterface inputUi) {
		this.ui = inputUi;
		
	}
	public void execute(int howManyTime) {
		for (int i = 0; i < howManyTime; i++) {
			System.out.println("The application logic works");
			ui.update();
		}
	}
}
