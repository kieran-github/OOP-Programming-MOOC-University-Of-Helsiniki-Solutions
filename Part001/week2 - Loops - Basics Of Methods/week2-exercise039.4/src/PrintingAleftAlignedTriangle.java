import javax.print.attribute.standard.PrinterStateReason;

import org.w3c.dom.css.Counter;

public class PrintingAleftAlignedTriangle {
	private static int counter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangle(4);
	}
	public static void printTriangle(int size) {
		for (int i = 0; i <= size; i++) {
			printStars(i);
		}
		
	}	
	public static void printStars(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
