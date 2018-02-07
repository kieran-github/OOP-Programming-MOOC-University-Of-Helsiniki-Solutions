import java.util.Scanner;

import sun.text.resources.cldr.st.FormatData_st;

public class GuessingGame {
	private String answer;

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        while (lowerLimit != upperLimit) {
			System.out.println("Is your number greater than "+ lowerLimit*2);
			answer = reader.nextLine();
			if (answer.equals("y")) {
				
			}
			else {
				System.out.println("Is your number less than "+ upperLimit/2);
				
			}
		}
        System.out.println("Your number is: " + lowerLimit);
    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    public boolean isGreaterThan(int value) {
    	System.out.println("Is your number greater than given value? (y/n)");
    	String command = reader.nextLine();
    	if (command.equals("y")) {
			return true;
		}
    	else {
    		return false;
    	}
    }
    public int average(int firstNumber, int secondNumber) {
    	int sum = firstNumber + secondNumber;
    	double average = sum / 2;
    	return (int)average;
    }
}