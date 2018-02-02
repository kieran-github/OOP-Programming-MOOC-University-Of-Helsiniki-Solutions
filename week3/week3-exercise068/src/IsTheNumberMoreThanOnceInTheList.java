import java.util.ArrayList;
import java.util.Scanner;

public class IsTheNumberMoreThanOnceInTheList {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("Type a number: ");
	    int number = input.nextInt();
	    if (moreThanOnce(list, number)) {
	        System.out.println(number + " appears more than once.");
	    } else {
	        System.out.println(number + " does not appear more than once.");
	    }
	}
	    
	private static boolean moreThanOnce(ArrayList<Integer> list, int i) {
		int counter = 0;
		for (Integer num : list) {
			if (num == i) {
				counter += 1;
			}
			else {
				continue;
			}
		}
		if (counter > 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
