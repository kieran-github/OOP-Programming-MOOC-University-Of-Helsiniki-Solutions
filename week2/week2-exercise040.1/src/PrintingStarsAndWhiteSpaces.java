
public class PrintingStarsAndWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void printWhitespaces(int size) {
		for (int i = 0; i <= size; i++) {
			System.out.print(" ");
		}
	}
	public static void printStars(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
